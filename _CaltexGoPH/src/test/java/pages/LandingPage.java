package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.BasePage;
import base.DriverManager;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LandingPage extends BasePage {
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement allowButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement signUpButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement loginButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement countrySelectorButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement philippinesButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement languageSelectorButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement englishButton;
	
	public LandingPage clickAllow() {
		System.out.println("LandingPage > clickAllow() was invoked.");
		
		//Store Web Element for allowButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(allowButton));
		System.out.println("Web Element for Allow Button was stored.");
		
		//Click Allow
		e.click();
		System.out.println("Allow Button was clicked.");

		return this;
	}
	
	public LandingPage clickSignUp() {
		System.out.println("LandingPage > clickSignUp() was invoked.");
		
		//Store Web Element for signUpButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(signUpButton));
		System.out.println("Web Element for Sign Up Button was stored.");
		
		//Click Sign Up
		e.click();
		System.out.println("Sign Up Button was clicked.");

		return this;
	}
	
	public LandingPage clickLogin() {
		System.out.println("LandingPage > clickLogin() was invoked.");
		
		//Store Web Element for loginButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(loginButton));
		System.out.println("Web Element for Login Button was stored.");
		
		//Click Log In Button
		e.click();
		System.out.println("Login Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickCountrySelector() {
		System.out.println("LandingPage > clickCountrySelector() was invoked.");
		
		//Store Web Element for countrySelectorButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(countrySelectorButton));
		System.out.println("Web Element for Country Selector was stored.");
		
		//Click Country Selector Button
		e.click();
		System.out.println("Country Selector Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickPhilippines() {
		System.out.println("LandingPage > clickPhilippines() was invoked.");
		
		//Store Web Element for philippinesButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(philippinesButton));
		System.out.println("Web Element for Philippines was stored.");
		
		//Click Philippines Button
		e.click();
		System.out.println("Philippines Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickLanguageSelector() {
		System.out.println("LandingPage > clickLanguageSelector() was invoked.");
		
		//Store Web Element for languageSelectorButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(languageSelectorButton));
		System.out.println("Web Element for Language Selector Button was stored.");
		
		//Click Language Selector Button
		e.click();
		System.out.println("Language Selector Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickEnglishButton() {
		System.out.println("LandingPage > clickEnglishButton() was invoked.");
		
		//Store Web Element for englishButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(englishButton));
		System.out.println("Web Element for English Button was stored.");
		
		//Click English Button
		e.click();
		System.out.println("English Button was clicked.");
		
		return this;
	}
	
	public LandingPage verifyCountriesAvailable(String[] countriesAvailable) {
		System.out.println("LandingPage > verifyCountriesAvailable() was invoked.");
		
		//Declare index
		int index = 1;
		System.out.println("Index was declared.");
		
		for (String country: countriesAvailable) {
			//Store Web Element for Country Option
			WebElement e = DriverManager.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup["+index+"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
			System.out.println("Web Element for Country Option was stored.");
					
			//Assert if Country Option is equal to expected
			Assert.assertEquals(e.getText(), country);
			System.out.println("Assert completed for Country Option '"+country+"'.");
			
			//Increment Index
			index++;
			System.out.println("Index was increment to '"+index+"'.");
		}
		
		return this;
	}
}
