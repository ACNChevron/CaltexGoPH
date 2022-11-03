package tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.EnterPasswordHereToLoginPage;
import pages.HomePage;
import pages.LandingPage;
import pages.MyAccountPage;
import pages.SignInPage;
import utils.AccessDatasheet;

public class OnBoarding_SignIn extends BaseTest {
	@Test(dataProvider="localDataSheet", enabled=false)
	public void Prereq_clickAllow (HashMap<String, String> testData) throws InterruptedException {		
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickAllow();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet", enabled=false)
	public void TS1_MobileNumber (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		HashMap <String, String> credentials = new AccessDatasheet().ReadGlobalTestData("Credentials");
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage passwordPage = new EnterPasswordHereToLoginPage();
		
		HomePage homePage = new HomePage();		
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		landingPage.clickLogin();
		
		signInPage.enterMobileNumber(testData.get("Incorrect Mobile Number"));
		
		signInPage.clickContinue();
		
		signInPage.verifyErrorMessage_IncorrectMobileNumber(testData.get("Error Message_Incorrect Mobile Number"));
		
		signInPage.enterMobileNumber(credentials.get("Mobile Number"));
		
		signInPage.clickContinue();

		passwordPage.enterPassword(credentials.get("Current Password"));
		
		passwordPage.clickLogin();
		
		Thread.sleep(3000);
		
		homePage.clickProfile();
		
		Thread.sleep(3000);		
		
		myAccountPage.closeImportantNotice();
		
		myAccountPage.clickLogOut();
		
		Thread.sleep(3000);		
		
		myAccountPage.clickYesIdLikeToLogOut();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet")
	public void TS2_EmailAddress (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		HashMap <String, String> credentials = new AccessDatasheet().ReadGlobalTestData("Credentials");
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage passwordPage = new EnterPasswordHereToLoginPage();
		
		HomePage homePage = new HomePage();		
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		landingPage.clickLogin();
		
		signInPage.clickLoginUsingEmail();
		
		signInPage.enterEmailAddress(credentials.get("Email Address"));
		
		signInPage.clickContinue();

		passwordPage.enterPassword(credentials.get("Current Password"));
		
		passwordPage.clickLogin();
		
		Thread.sleep(3000);	
		
		homePage.clickProfile();
		
		myAccountPage.closeImportantNotice();
		
		myAccountPage.clickLogOut();
		
		myAccountPage.clickYesIdLikeToLogOut();
		
		Thread.sleep(3000);		
	}
}
