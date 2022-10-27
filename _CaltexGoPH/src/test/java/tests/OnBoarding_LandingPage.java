package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;

public class OnBoarding_LandingPage extends BaseTest {

	@Test(dataProvider="localDataSheet")
	public void Prereq_clickAllow (HashMap<String, String> testData) throws InterruptedException {		
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickAllow();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet")
	public void TS1_CountrySelector (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickCountrySelector();
		
		landingPage.verifyCountriesAvailable(testData.get("Country Options").split(";"));
		
		landingPage.clickPhilippines();
		
		Thread.sleep(3000);	
	}
	
	@Test(dataProvider="localDataSheet")
	public void TS2_ChangeLanguage (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickLanguageSelector();
		
		landingPage.clickEnglishButton();
		
		Thread.sleep(3000);	
	}
}
