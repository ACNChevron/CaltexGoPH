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
import pages.VerifyEmailPage;
import utils.AccessDatasheet;

public class OnBoarding_SignIn extends BaseTest {
	@Test(dataProvider="localDataSheet", priority=0, enabled=false)
	public void Prereq_clickAllow (HashMap<String, String> testData) throws InterruptedException {		
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickAllow();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet", priority=1)
	public void MobileNumber_LogIn_InvalidDetails (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		landingPage.clickLogin();
		
		signInPage.enterMobileNumber(testData.get("Incorrect Mobile Number"));
		
		signInPage.clickContinue();
		
		signInPage.verifyErrorMessage_IncorrectMobileNumber(testData.get("Error Message_Incorrect Mobile Number"));	
	}
		
	@Test(dataProvider="localDataSheet", priority=2)
	public void MobileNumber_LogIn_VerifiedUser (HashMap<String, String> testData) throws InterruptedException, IOException {	
		
		HashMap <String, String> credentials = new AccessDatasheet().ReadGlobalTestData("Credentials");
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage passwordPage = new EnterPasswordHereToLoginPage();
		
		HomePage homePage = new HomePage();		
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		signInPage.enterMobileNumber(credentials.get("Mobile Number"));
		
		signInPage.clickContinue();

		passwordPage.enterPassword(credentials.get("Current Password"));
		
		passwordPage.clickLogin();
		
		Thread.sleep(3000);
		
		homePage.closeImportantNotice();
		
		homePage.clickProfile();
		
		myAccountPage.clickLogOut();
		
		myAccountPage.clickYesIdLikeToLogOut();
	}
	
	@Test(dataProvider="localDataSheet", priority=3)
	public void MobileNumber_LogIn_UnverifiedUser (HashMap<String, String> testData) throws InterruptedException, IOException {	
		
		HashMap <String, String> credentials = new AccessDatasheet().ReadGlobalTestData("Credentials");
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage passwordPage = new EnterPasswordHereToLoginPage();
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		HomePage homePage = new HomePage();	
		
		landingPage.clickLogin();

		signInPage.enterMobileNumber(credentials.get("Mobile Number_Unverified User"));
		
		signInPage.clickContinue();

		passwordPage.enterPassword(credentials.get("Password_Unverified User"));
		
		passwordPage.clickLogin();
		
		Thread.sleep(3000);
		
		homePage.closeImportantNotice();
		
		homePage.clickProfile();
		
		myAccountPage.verifyInfoMessage_VerifyYourEmailExists();
		
		myAccountPage.closeInfoMessage();
		
		myAccountPage.clickLogOut();
		
		myAccountPage.clickYesIdLikeToLogOut();
	}
	
	@Test(dataProvider="localDataSheet", priority=4)
	public void EmailAddress_LogIn_VerifiedUser (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
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
		
		homePage.closeImportantNotice();
		
		homePage.clickProfile();
		
		myAccountPage.clickLogOut();
		
		myAccountPage.clickYesIdLikeToLogOut();
	}
	
	@Test(dataProvider="localDataSheet", priority=5)
	public void EmailAddress_LogIn_UnverifiedUser (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		HashMap <String, String> credentials = new AccessDatasheet().ReadGlobalTestData("Credentials");
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage passwordPage = new EnterPasswordHereToLoginPage();
		
		VerifyEmailPage verifyEmailPage = new VerifyEmailPage();
		
		landingPage.clickLogin();
		
		signInPage.clickLoginUsingEmail();
		
		signInPage.enterEmailAddress(credentials.get("Email Address_Unverified User"));
		
		signInPage.clickContinue();

		passwordPage.enterPassword(credentials.get("Password_Unverified User"));
		
		passwordPage.clickLogin();
		
		verifyEmailPage.verifyHeaderMessage_VerifyYourEmailExists();
		
		verifyEmailPage.clickBack();
		
		passwordPage.clickBack();
		
		signInPage.clickBack();
	}
}
