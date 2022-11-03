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
			switch(key.toString()) {
			case "url": System.out.println("URL '"+deviceObj.get(key)+"' was stored.");	break;
			case "platformName": System.out.println("Platform Name '"+deviceObj.get(key)+"' was stored.");	break;
			default: 
				caps.setCapability(key.toString(), deviceObj.get(key).toString());
				System.out.println("Capability '"+key.toString()+":"+deviceObj.get(key)+"' was set.");	
				break;
			}	
		}
		
		//Declare URL
		URL url = new URL(deviceObj.get("url").toString());
		System.out.println("URL url was declared.");
			
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
		
		Thread.sleep(10000);	
	}
}
