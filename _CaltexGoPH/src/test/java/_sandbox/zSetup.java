package _sandbox;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class zSetup {
	@Test
	public void Setup () throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoyMTc5Mzg5MiwieHAucCI6MjE3OTM4OTEsInhwLm0iOjE2Njc0NDAyNzQzMTEsImV4cCI6MTk4MjgwNDYxMCwiaXNzIjoiY29tLmV4cGVyaXRlc3QifQ.s1POn76r-_tlZoxnbht3C6tlRtq14wNGIy4xPPZoZag";
		caps.setCapability("testName", "Quick Start Android Native Demo");
		caps.setCapability("accessKey", accessKey);
		//caps.setCapability("deviceQuery", "@os='android'and @category='PHONE'");
		caps.setCapability("app", "cloud:com.chevron.caltexgo.prod/.MainActivity");
		caps.setCapability("appPackage", "com.chevron.caltexgo.prod");
		caps.setCapability("appActivity", ".MainActivity");
		caps.setCapability("udid", "ZY323DHSZ9");
		AndroidDriver<AndroidElement>driver = new AndroidDriver<>(new URL("https://cloud.seetest.io/wd/hub"),caps);
		
		System.out.println(driver);
	}
}
