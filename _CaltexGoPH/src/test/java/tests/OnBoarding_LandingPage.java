package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;

public class OnBoarding_LandingPage extends BaseTest {

	@Test(dataProvider="localDataSheet", priority=0, enabled=false)
	public void Prereq_clickAllow (HashMap<String, String> testData) throws InterruptedException {		
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickAllow();
		
		Thread.sleep(5000);		
	}
	
	@Test(dataProvider="localDataSheet", priority=1)
	public void CountrySelector_VerifyCountriesAvailable (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickCountrySelector();
		
		landingPage.verifyCountriesAvailable(testData.get("Country Options").split(";"));
		
		landingPage.clickPhilippines();
		
		Thread.sleep(3000);	
	}
	
	@Test(dataProvider="localDataSheet",priority=2)
	public void ChangeLanguage_VerifySupportedLanguagesPerCountry_Australia (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickCountrySelector();
		
		landingPage.clickAustralia();
		
		landingPage.clickLanguageSelector();
		
		landingPage.verifySupportedLanguagesPerCountry(testData.get("Language Options_Australia").split(";"));		
		
		landingPage.clickEnglish();
	}
	
	@Test(dataProvider="localDataSheet",priority=3)
	public void ChangeLanguage_VerifySupportedLanguagesPerCountry_Malaysia (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickCountrySelector();
		
		landingPage.clickMalaysia();
		
		landingPage.clickLanguageSelector();
		
		landingPage.verifySupportedLanguagesPerCountry(testData.get("Language Options_Malaysia").split(";"));		
		
		landingPage.clickBahasaMelayu();
	}
	
	@Test(dataProvider="localDataSheet",priority=4)
	public void ChangeLanguage_VerifyPageTranslation_BahasaMelayu (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.verifyDaftarButtonIsPresent();
		
		landingPage.verifyLogMasukButtonIsPresent();
	}
	
	@Test(dataProvider="localDataSheet",priority=5)
	public void ChangeLanguage_VerifySupportedLanguagesPerCountry_Philippines (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickCountrySelector();
		
		landingPage.clickPhilippines();
		
		landingPage.clickLanguageSelector();
		
		landingPage.verifySupportedLanguagesPerCountry(testData.get("Language Options_Philippines").split(";"));		
		
		landingPage.clickEnglish();
	}
	
	@Test(dataProvider="localDataSheet",priority=6)
	public void ChangeLanguage_VerifyPageTranslation_English (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.verifySignUpButtonIsPresent();
		
		landingPage.verifyLogInButtonIsPresent();
	}
	
	@Test(dataProvider="localDataSheet",priority=7)
	public void ChangeLanguage_VerifySupportedLanguagesPerCountry_Thailand (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickCountrySelector();
		
		landingPage.clickThailand();
		
		landingPage.clickLanguageSelector();
		
		landingPage.verifySupportedLanguagesPerCountry(testData.get("Language Options_Thailand").split(";"));		
		
		landingPage.clickThai();
	}
	
	@Test(dataProvider="localDataSheet",priority=8)
	public void ChangeLanguage_VerifyPageTranslation_Thai (HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.verifySignUpThaiButtonIsPresent();
		
		landingPage.verifyLogInThaiButtonIsPresent();
		
		landingPage.clickCountrySelector();
		
		landingPage.clickPhilippines();
	}
}
