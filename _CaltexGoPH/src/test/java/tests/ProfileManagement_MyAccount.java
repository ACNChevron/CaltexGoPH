package tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.EditProfilePage;
import pages.EnterPasswordHereToLoginPage;
import pages.HomePage;
import pages.LandingPage;
import pages.MyAccountPage;
import pages.SignInPage;
import utils.AccessDatasheet;

public class ProfileManagement_MyAccount extends BaseTest {
	@Test(dataProvider="localDataSheet")
	public void Prereq1_clickAllow (HashMap<String, String> testData) throws InterruptedException {		
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickAllow();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet")
	public void Prereq2_SignInUsingMobileNumber (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		HashMap <String, String> credentials = new AccessDatasheet().ReadGlobalTestData("Credentials");
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage passwordPage = new EnterPasswordHereToLoginPage();
		
		landingPage.clickLogin();
		
		signInPage.enterMobileNumber(credentials.get("Mobile Number"));
		
		signInPage.clickContinue();

		passwordPage.enterPassword(credentials.get("Current Password"));
		
		passwordPage.clickLogin();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet")
	public void TS1_EditProfile (HashMap<String, String> testData) throws InterruptedException, IOException {		
				
		HomePage homePage = new HomePage();
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		EditProfilePage editProfilePage = new EditProfilePage();
		
		homePage.clickProfile();
		
		myAccountPage.clickEditProfie();
		
		editProfilePage.enterNewFirstName(testData.get("New First Name"));
		
		editProfilePage.enterNewLastName(testData.get("New Last Name"));
		
		editProfilePage.clickSave();
		
		Thread.sleep(3000);		
	}
}
