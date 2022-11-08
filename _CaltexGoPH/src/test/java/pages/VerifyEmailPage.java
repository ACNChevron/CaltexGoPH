package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class VerifyEmailPage extends BasePage {
	@AndroidFindBy(xpath = "//*[@text='Before you log in, we need to verify your email.']")
	@iOSXCUITFindBy(xpath = "//*[@text='Before you log in, we need to verify your email.']")
	private WebElement HeaderMessage_VerifyYourEmail;
	
	@AndroidFindBy(xpath = "(//*[@id='ProfileVerificationScreen']/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]")
	@iOSXCUITFindBy(xpath = "(//*[@id='ProfileVerificationScreen']/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]")
	private WebElement backButton;
	
	public VerifyEmailPage verifyHeaderMessage_VerifyYourEmailExists() {
		System.out.println("WelcomeBackLoginToContinuePage > verifyHeaderMessage_VerifyYourEmailExists() was invoked.");
		
		//Store Web Element for Header Message
		WebElement e = wait.until(ExpectedConditions.visibilityOf(HeaderMessage_VerifyYourEmail));
		System.out.println("Web Element for Header Message was stored.");
		
		//Verify Header Message is displayed
		e.isDisplayed();
		System.out.println("Header Message was verified to be displayed.");

		return this;
	}
	
	public VerifyEmailPage clickBack() {
		System.out.println("VerifyEmailPage > clickBack() was invoked.");
		
		//Store Web Element for Back Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(backButton));
		System.out.println("Web Element for Back Button was stored.");
		
		//Click Back Button
		e.click();
		System.out.println("Back Button was clicked.");

		return this;
	}
}
