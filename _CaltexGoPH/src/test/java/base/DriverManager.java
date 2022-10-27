package base;

import java.net.URL;
import java.util.Set;

import org.json.simple.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import utils.CommandLineRunner;
import utils.JsonParser;

@SuppressWarnings("rawtypes")
public class DriverManager {

	private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
	
	public static AppiumDriver getDriver() {return driver.get();}
	
	public static void setDriver(AppiumDriver driver1) {driver.set(driver1);}
	
	public static void initializeDriver(String deviceID) throws Exception {
		System.out.println("DriverManager > initializeDriver() was invoked.");
		
		//Declare Appium Driver/
		AppiumDriver driver;
		System.out.println("Appium Driver was declared.");
		
		//Declare JSONObject
		JSONObject deviceObj = new JSONObject();
		System.out.println("JSONObject was declared.");
		
		//Parse Device objects from Devices.json
		deviceObj = (JSONObject) JsonParser.parse("Devices.json").get(deviceID);
		System.out.println("Device objects from Devices.json was parsed.");
		
		//Store Key set of Device Object
		Set<?> keyDeviceObj = deviceObj.keySet();
		System.out.println("Key set of Device Object was stored.");
		
		//Declare Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		System.out.println("Desired Capabilities was declared.");

		//Set Desired Capabilities
		for (Object key : keyDeviceObj) {
			switch(key.toString()){
			case "url": System.out.println("URL from Devices.json '"+deviceObj.get(key)+"' was stored."); break;
			case "app": System.out.println("App Public URL from Devices.json '"+deviceObj.get(key)+"' was stored."); break;
			default: 
				caps.setCapability(key.toString(), deviceObj.get(key).toString());
				System.out.println("Capability '"+key.toString()+":"+deviceObj.get(key)+"' was set.");					
			}
		}
		
		//Declare Credentials Object
		JSONObject credentialsObj = new JSONObject();
		System.out.println("Credentials Object was declared.");
		
		//Parse Credentials objects from Credentials_BrowserStack.json
		credentialsObj = (JSONObject) JsonParser.parse("Credentials_BrowserStack.json").get("Credentials");
		System.out.println("Credentials objects from Credentials_BrowserStack.json was parsed.");
		
		//Store BrowserStack Username
		String userName = (String) credentialsObj.get("userName");
		System.out.println("BrowserStack Username '"+userName+"' was stored.");
		
		//Store BrowserStack Access Key
		String accessKey = (String) credentialsObj.get("accessKey");
		System.out.println("BrowserStack Access Key '"+accessKey+"' was stored.");
		
		//Declare URL
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		System.out.println("URL url was declared.");
		
		if (deviceObj.containsKey("udid")) {
			//If the Device object contain udid, skip setting capability for app
			System.out.println("Device object was verified to contain udid thus setting capability for app will be skipped.");
			
			//Declare URL
			url = new URL(deviceObj.get("url").toString());
			System.out.println("URL '"+url+"' was stored.");
		} else if (deviceObj.containsKey("app_PublicURL")) {
			//Set capability for app_PublicURL
			String app_PublicURL = (String) deviceObj.get("app_PublicURL");
			System.out.println("App's Public URL was stored.");
			
			//Store command line
			String commandLine = "curl -u \""+userName+":"+accessKey+"\" -X POST \"https://api-cloud.browserstack.com/app-automate/upload\" -F \"url="+app_PublicURL+"\"";
			System.out.println("Command line '"+commandLine+"' was stored.");
			
			//Store output command
			String caps_app = CommandLineRunner.EnterCommand(commandLine);
			System.out.println("Value of caps_app '"+caps_app+"' was stored.");
			
			//Remove unnecessary characters on caps_app
			caps_app = caps_app.substring(caps_app.indexOf("bs://"), caps_app.indexOf("\"}"));
			System.out.println("Unnecessary characters on caps_app was removed.");
			
			//Set capability for app
			caps.setCapability("app", caps_app);
			System.out.println("Capability 'app:"+caps_app+"' was set.");
			
			//Declare URL
			url = new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub");
			System.out.println("URL '"+url+"' was stored.");
		} else if (deviceObj.containsKey("app")) {
			//Set capability for app
			caps.setCapability("app", deviceObj.get("app"));
			System.out.println("Capability 'app:"+ deviceObj.get("app")+"' was set.");
			
			//Declare URL
			url = new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub");
			System.out.println("URL '"+url+"' was stored.");
		}
		
		//Set Driver value
		switch (deviceObj.get("platformName").toString()) {
			case "Android":
				driver = new AndroidDriver<AndroidElement>(url,caps);
				System.out.println("Android Driver was set.");
				break;
			case "IOS":
				driver = new IOSDriver<IOSElement>(url, caps);
				System.out.println("IOS Driver was set.");
				break;
			default:
				System.out.println("Failed in getting platformName '\"+deviceObj.get(\"platformName\").toString()+\"'.");
				throw new IllegalStateException("Failed in getting platformName '"+deviceObj.get("platformName").toString()+"'.");
		}
		
		//Set Driver for whole test
		setDriver(driver);
		System.out.println("Driver was set for the whole test.");
	}
}
