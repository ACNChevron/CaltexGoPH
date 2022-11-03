package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SignInPage extends BasePage {
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	@iOSXCUITFindBy(xpath = "//*[@class='android.widget.EditText']")
	private WebElement mobileNumberField;
	
	@AndroidFindBy(xpath = "//*[@text='Continue']")
	@iOSXCUITFindBy(xpath = "//*[@text='Continue']")
	private WebElement continueButton;
	
	@AndroidFindBy(xpath = "//*[@text='or login using e-mail address']")
	@iOSXCUITFindBy(xpath = "//*[@text='or login using e-mail address']")
	private WebElement loginUsingEmailButton;

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	@iOSXCUITFindBy(xpath = "//*[@class='android.widget.EditText']")
	private WebElement emailAddressField;
	
	@AndroidFindBy(xpath = "//*[@text='Your login details are incorrect. Please try again or sign up for an account.']")
	@iOSXCUITFindBy(xpath = "//*[@text='Your login details are incorrect. Please try again or sign up for an account.']")
	private WebElement errorMessage_IncorrectMobileNumber;
	
	public SignInPage enterMobileNumber(String mobileNumber) {
		System.out.println("WelcomeBackLoginToContinuePage > enterMobileNumber() was invoked.");
		
		//Store Web Element for Mobile Number Field
		WebElement e = wait.until(ExpectedConditions.visibilityOf(mobileNumberField));
		System.out.println("Web Element for Mobile Number Field was stored.");
		
		//Enter Mobile Number
		e.sendKeys(mobileNumber);
		System.out.println("Mobile Number was entered.");

		return this;
	}
	
	public SignInPage clickContinue() {
		System.out.println("SignInPage > clickContinue() was invoked.");
		
		//Store Web Element for allowButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(continueButton));
		System.out.println("Web Element for Continue Button was stored.");
		
		//Click Continue Button
		e.click();
		System.out.println("Continue Button was clicked.");

		return this;
	}	
	
	public SignInPage clickLoginUsingEmail() {
		System.out.println("SignInPage > clickLoginUsingEmail() was invoked.");
		
		//Store Web Element for loginUsingEmailButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(loginUsingEmailButton));
		System.out.println("Web Element for Login using Email Button was stored.");
		
		//Click Login using Email Button
		e.click();
		System.out.println("Login using Email Button was clicked.");

		return this;
	}	
	
	public SignInPage enterEmailAddress(String emailAddress) {
		System.out.println("SignInPage > enterEmailAddress() was invoked.");
		
		//Store Web Element for emailAddressField
		WebElement e = wait.until(ExpectedConditions.visibilityOf(emailAddressField));
		System.out.println("Web Element for Email Address Field was stored.");
		
		//Enter Email Address
		e.sendKeys(emailAddress);
		System.out.println("Email Address '"+emailAddress+"' was stored.");

		return this;
	}	
	
	public SignInPage verifyErrorMessage_IncorrectMobileNumber(String expectedErrorMessage) {
		System.out.println("SignInPage > verifyErrorMessage_IncorrectMobileNumber() was invoked.");
		
		//Store Web Element for Error Message Incorrect Mobile Number
		WebElement e = wait.until(ExpectedConditions.visibilityOf(errorMessage_IncorrectMobileNumber));
		System.out.println("WebElement for Error Message_Incorrect Mobile Number was stored.");
		
		//Verify if Error Message is equal to expected
		Assert.assertEquals(e.getText(), expectedErrorMessage);
		System.out.println("Error message was verified to be equal to expected.");

		return this;
	}	
}
