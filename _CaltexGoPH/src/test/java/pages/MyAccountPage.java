package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyAccountPage extends BasePage {
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement settingsButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.TextView")
	private WebElement logOutButton;
	
	@AndroidFindBy(xpath = "//*[@text=concat('Yes, I', \"'\", 'd like to log out')]")
	@iOSXCUITFindBy(xpath = "//*[@text=concat('Yes, I', \"'\", 'd like to log out')]")
	private WebElement yesButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement editProfileButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
	private WebElement loyaltyProgramButton;
	
	@AndroidFindBy(xpath = "//*[@text='Verify your email to secure your account and earn 5000 Caltex points!']")
	@iOSXCUITFindBy(xpath = "//*[@text='Verify your email to secure your account and earn 5000 Caltex points!']")
	private WebElement infoMessage_VerifyYourEmail;
	
	@AndroidFindBy(xpath = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Verify your email to secure your account and earn 5000 Caltex points!']]]")
	@iOSXCUITFindBy(xpath = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Verify your email to secure your account and earn 5000 Caltex points!']]]")
	private WebElement infoMessage_CloseButton;
	
	public MyAccountPage clickSettings() {
		System.out.println("MyAccountPage > clickSettings() was invoked.");
		
		//Store Web Element for Settings Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(settingsButton));
		System.out.println("Web Element for Settings Button was stored.");
		
		//Click Settings Button
		e.click();
		System.out.println("Settings was clicked.");

		return this;
	}
	
	public MyAccountPage clickLogOut() {
		System.out.println("MyAccountPage > clickLogOut() was invoked.");
		
		//Store Web Element for Log Out Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(logOutButton));
		System.out.println("Web Element for Settings Button was stored.");
		
		//Click Log Out Button
		e.click();
		System.out.println("Log Out was clicked.");

		return this;
	}	

	public MyAccountPage clickYesIdLikeToLogOut() {
		System.out.println("MyAccountPage > clickYesIdLikeToLogOut() was invoked.");
		
		//Store Web Element for Yes I'd Like to Log Out Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(yesButton));
		System.out.println("Web Element for Yes, I'd Like to Log Out Button was stored.");
		
		//Click Yes, I'd Like to Log Out Button
		e.click();
		System.out.println("Yes, I'd Like to Log Out Button was clicked.");

		return this;
	}	
	
	public MyAccountPage clickEditProfie() {
		System.out.println("MyAccountPage > clickEditProfie() was invoked.");
		
		//Store Web Element for Edit Profile Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(editProfileButton));
		System.out.println("Web Element for Edit Profile Button was stored.");
		
		//Click Edit Profile Button
		e.click();
		System.out.println("Edit Profile Button was clicked.");

		return this;
	}
	
	public MyAccountPage clickLoyaltyProgram() {
		System.out.println("MyAccountPage > clickLoyaltyProgram() was invoked.");
		
		//Store Web Element for Loyalty Program Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(loyaltyProgramButton));
		System.out.println("Web Element for Loyalty Program Button was stored.");
		
		//Click Loyalty Program Button
		e.click();
		System.out.println("Loyalty Program Button was clicked.");

		return this;
	}	
	
	public MyAccountPage verifyInfoMessage_VerifyYourEmailExists() {
		System.out.println("MyAccountPage > verifInfoMessage_VerifyYourEmailExists() was invoked.");
		
		//Store Web Element for infoMessage_VerifyYourEmail
		WebElement e = wait.until(ExpectedConditions.visibilityOf(infoMessage_VerifyYourEmail));
		System.out.println("Web Element for Info Message Verify Your Email was stored.");
		
		//Verify Info Message Verify Your Email exists
		e.isDisplayed();
		System.out.println("Info Message was verified to be displayed.");

		return this;
	}	
	
	public MyAccountPage closeInfoMessage() {
		System.out.println("MyAccountPage > closeInfoMessage() was invoked.");
		
		//Store Web Element for infoMessage_CloseButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(infoMessage_CloseButton));
		System.out.println("Web Element for Info Message Close Button was stored.");
		
		//Click Info Message Close Button
		e.click();
		System.out.println("Info Message Close Button was clicked.");

		return this;
	}	
}
