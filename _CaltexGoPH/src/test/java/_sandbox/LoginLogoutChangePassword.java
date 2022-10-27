package _sandbox;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ChangePasswordPage;
import pages.EnterPasswordHereToLoginPage;
import pages.HomePage;
import pages.LandingPage;
import pages.MyAccountPage;
import pages.SettingsPage;
import pages.SignInPage;
import utils.AccessDatasheet;

public class LoginLogoutChangePassword extends BaseTest {
	
	@Test(dataProvider="LoginLogoutChangePassword")
	public void TS1_LoginWithTenDigitNumber(HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage enterPasswordPage = new EnterPasswordHereToLoginPage();
		
		landingPage.clickAllow();
		
		Thread.sleep(10000);
		
		landingPage.clickLogin();
		
		signInPage.enterMobileNumber(testData.get("Mobile Number"));
		
		signInPage.clickContinue();
				
		enterPasswordPage.enterPassword(testData.get("Current Password"));
		
		enterPasswordPage.clickLogin();
		
		Thread.sleep(10000);
	}
	
	@Test(dataProvider="LoginLogoutChangePassword")
	public void TS2_ChangePassword(HashMap<String, String> testData) throws InterruptedException, IOException {
		
		HomePage homePage = new HomePage();
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		SettingsPage settingsPage = new SettingsPage();
		
		ChangePasswordPage changePasswordPage = new ChangePasswordPage();
		
		homePage.clickProfile();
		
		myAccountPage.clickSettings();
		
		settingsPage.clickChangePassword();
		
		changePasswordPage.enterCurrentPassword(testData.get("Current Password"));
		
		changePasswordPage.enterNewPassword(testData.get("New Password"));
		
		changePasswordPage.reEnterNewPassword(testData.get("New Password"));
		
		AccessDatasheet datasheet = new AccessDatasheet();
		
		double counter = Double.parseDouble(testData.get("Counter"));
		
		counter = counter + 1;
		
		datasheet.WriteTestData("LoginLogoutChangePassword","Counter", Double.toString(counter));
		
		changePasswordPage.clickSaveChanges();
		
		Thread.sleep(10000);
	}
	
	@Test(dataProvider="LoginLogoutChangePassword")
	public void TS3_LogOut(HashMap<String, String> testData) throws InterruptedException {
		
		SettingsPage settingsPage = new SettingsPage();
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		settingsPage.clickBack();
		
		myAccountPage.clickLogOut();
		
		myAccountPage.clickYesIdLikeToLogOut();
		
		Thread.sleep(10000);
	}	
	
	@Test(dataProvider="LoginLogoutChangePassword")
	public void TS4_LoginWithEmail_NegativeTesting(HashMap<String, String> testData) throws InterruptedException {
		
		LandingPage landingPage = new LandingPage();
		
		SignInPage signInPage = new SignInPage();
		
		EnterPasswordHereToLoginPage enterPasswordPage = new EnterPasswordHereToLoginPage();
		
		landingPage.clickLogin();
		
		signInPage.clickLoginUsingEmail();
		
		signInPage.enterEmailAddress(testData.get("Email Address"));
		
		signInPage.clickContinue();
		
		enterPasswordPage.enterPassword(testData.get("Incorrect Password"));
		
		enterPasswordPage.clickLogin();
		
		Thread.sleep(10000);
	}	
	
	@Test(dataProvider="LoginLogoutChangePassword")
	public void TS5_LoginWithEmail(HashMap<String, String> testData) throws InterruptedException {
		
		EnterPasswordHereToLoginPage enterPasswordPage = new EnterPasswordHereToLoginPage();
			
		enterPasswordPage.enterPassword(testData.get("Current Password"));
		
		enterPasswordPage.clickLogin();
		
		Thread.sleep(10000);
	}	
}
