package tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.EnterPasswordHereToLoginPage;
import pages.HomePage;
import pages.LandingPage;
import pages.LoyaltyProgramSettingsPage;
import pages.MyAccountPage;
import pages.SignInPage;
import utils.AccessDatasheet;
import utils.SwipeScreen;
import utils.SwipeScreen.Direction;

public class ProfileManagement_Loyalty extends BaseTest{
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
	public void TS1_ChangeDefaultLoyalty (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		HomePage homePage = new HomePage();
		
		MyAccountPage myAccountPage = new MyAccountPage();
		
		LoyaltyProgramSettingsPage loyaltyProgramSettingsPage = new LoyaltyProgramSettingsPage();
		
		homePage.clickProfile();
		
		myAccountPage.clickLoyaltyProgram();
		
		loyaltyProgramSettingsPage.clickCaltexRewardsOptions();
		
		loyaltyProgramSettingsPage.clickChangeDefaultOption();
		
		loyaltyProgramSettingsPage.clickGoRewards();
		
		loyaltyProgramSettingsPage.clickConfirm();
		
		loyaltyProgramSettingsPage.clickCaltexRewardsOptions();
		
		loyaltyProgramSettingsPage.clickSetAsDefault();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet")
	public void TS2_GoRewards_Unlink (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		LoyaltyProgramSettingsPage loyaltyProgramSettingsPage = new LoyaltyProgramSettingsPage();
		
		loyaltyProgramSettingsPage.clickGoRewardsOptions();
		
		loyaltyProgramSettingsPage.clickUnlinkGoRewards();
		
		loyaltyProgramSettingsPage.clickYesProceed();
		
		Thread.sleep(3000);		
	}
	
	@Test(dataProvider="localDataSheet")
	public void TS3_GoRewards_Link (HashMap<String, String> testData) throws InterruptedException, IOException {		
		
		LoyaltyProgramSettingsPage loyaltyProgramSettingsPage = new LoyaltyProgramSettingsPage();
		
		SwipeScreen swipe = new SwipeScreen();
		
		loyaltyProgramSettingsPage.clickLinkNewLoyaltyProgram();
		
		loyaltyProgramSettingsPage.clickLink_GoRewardsButton();
		
		loyaltyProgramSettingsPage.enterGoRewardsCardNumber(testData.get("Go Rewards Card Number"));
		
		loyaltyProgramSettingsPage.enterFullName(testData.get("Full Name"));
		
		swipe.swipeScreen(Direction.UP);		
		
		loyaltyProgramSettingsPage.clickLinkPartnerProgram();
			
		loyaltyProgramSettingsPage.clickClose();
		
		Thread.sleep(3000);		
	}
	
}
