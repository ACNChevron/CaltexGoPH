package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInPage extends BasePage {
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
	private WebElement mobileNumberField;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
	private WebElement continueButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement loginUsingEmailButton;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
	private WebElement emailAddressField;
	
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
		System.out.println("WelcomeBackLoginToContinuePage > clickContinue() was invoked.");
		
		//Store Web Element for allowButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(continueButton));
		System.out.println("Web Element for Continue Button was stored.");
		
		//Click Continue Button
		e.click();
		System.out.println("Continue Button was clicked.");

		return this;
	}	
	
	public SignInPage clickLoginUsingEmail() {
		System.out.println("WelcomeBackLoginToContinuePage > clickLoginUsingEmail() was invoked.");
		
		//Store Web Element for loginUsingEmailButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(loginUsingEmailButton));
		System.out.println("Web Element for Login using Email Button was stored.");
		
		//Click Login using Email Button
		e.click();
		System.out.println("Login using Email Button was clicked.");

		return this;
	}	
	
	public SignInPage enterEmailAddress(String emailAddress) {
		System.out.println("WelcomeBackLoginToContinuePage > enterEmailAddress() was invoked.");
		
		//Store Web Element for emailAddressField
		WebElement e = wait.until(ExpectedConditions.visibilityOf(emailAddressField));
		System.out.println("Web Element for Email Address Field was stored.");
		
		//Enter Email Address
		e.sendKeys(emailAddress);
		System.out.println("Email Address '"+emailAddress+"' was stored.");

		return this;
	}	

}
