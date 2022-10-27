package base;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.AccessDatasheet;

public class BaseTest {
	@Parameters({"deviceID"})
	@BeforeTest
	public void beforeTest(String deviceID) throws Exception {
		System.out.println("BaseTest > beforeTest() was invoked.");
		
		//Initialize Driver
		DriverManager.initializeDriver(deviceID);
		System.out.println("Driver was initialized.");
	}
	
	@AfterTest(alwaysRun = true)
	public void quit() {
		System.out.println("BaseTest > quit() was invoked.");
		
		//Quit Driver
		if(DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
			System.out.println("Driver was quitted.");
		}
	}
	
	@DataProvider(name="localDataSheet")
	public Object[][] localDataSheet(Class<?> c) throws IOException {
		System.out.println("BaseTest > localDataSheet() was invoked.");
		
		//Declare dDatasheet
		AccessDatasheet datasheet = new AccessDatasheet();
		System.out.println("Datasheet was declared.");
	
		//Declare Test Data
		HashMap<String, String> testData = new HashMap<String, String>();
		System.out.println("Test Data was declared.");
		
		//Store Scenario name
		String scenarioName = c.toString().replace("class tests.", "");
		System.out.println("Scenario Name '"+scenarioName+"' was stored.");
		
		//Store Test Data
		testData = datasheet.ReadLocalTestData(scenarioName, "Sheet1");
		System.out.println("Test Data was stored.");
	
		return new Object[][] {{testData}};
	}
}
