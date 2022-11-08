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
	@Test(dataProvider="localDataSheet", priority=0, enabled=false)
	public void Prereq_clickAllow (HashMap<String, String> testData) throws InterruptedException {		
		
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickAllow();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet", priority=1)
	public void Prereq1_SignIn (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		HashMap <String, String> credentials = new AccessDatasheet().ReadGlobalTestData("Credentials");
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage passwordPage = new EnterPasswordHereToLoginPage();
		
		HomePage homePage = new HomePage();
		
		landingPage.clickLogin();
		
		signInPage.enterMobileNumber(credentials.get("Mobile Number"));
		
		signInPage.clickContinue();

		passwordPage.enterPassword(credentials.get("Current Password"));
		
		passwordPage.clickLogin();	
		
		homePage.closeImportantNotice();
	}
	
	@Test(dataProvider="localDataSheet", priority=2)
	public void EditProfile_EditUsingInvalidFirstNameAndLastName (HashMap<String, String> testData) throws InterruptedException, IOException {		
					
		HomePage homePage = new HomePage();
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		EditProfilePage editProfilePage = new EditProfilePage();
		
		homePage.clickProfile();
		
		myAccountPage.clickEditProfie();
		
		editProfilePage.enterNewFirstName(testData.get("New First Name_Invalid"));
		
		editProfilePage.verifyErrorMessage_FirstNameShouldNotContainSpecialCharacters();
		
		editProfilePage.enterNewLastName(testData.get("New Last Name_Invalid"));
		
		editProfilePage.verifyErrorMessage_LastNameShouldNotContainSpecialCharacters();
	}
	
	@Test(dataProvider="localDataSheet", priority=3)
	public void EditProfile_VerifyPopUpModal_BirthdayAndMobileNumber (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		EditProfilePage editProfilePage = new EditProfilePage();
		
		editProfilePage.clickBirthMonthAndYear();
		
		editProfilePage.verifyPopUpModal();
		
		editProfilePage.closePopUpModal();
		
		editProfilePage.clickMobileNumber();
		
		editProfilePage.verifyPopUpModal();
		
		editProfilePage.closePopUpModal();
	}
	
	@Test(dataProvider="localDataSheet", priority=4)
	public void EditProfile_EditUsingValidFirstNameAndLastName (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		EditProfilePage editProfilePage = new EditProfilePage();
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		editProfilePage.enterNewFirstName(testData.get("New First Name"));
		
		editProfilePage.enterNewLastName(testData.get("New Last Name"));
		
		editProfilePage.clickSave();
		
		myAccountPage.clickLogOut();
		
		myAccountPage.clickYesIdLikeToLogOut();
	}
}
