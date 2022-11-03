package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.BasePage;
import base.DriverManager;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LandingPage extends BasePage {
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	@iOSXCUITFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement allowButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement signUpButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement loginButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement countrySelectorButton;
	
	@AndroidFindBy(xpath = "//*[@text='Philippines']")
	@iOSXCUITFindBy(xpath = "//*[@text='Philippines']")
	private WebElement philippinesButton;
	
	@AndroidFindBy(xpath = "//*[@text='Australia']")
	@iOSXCUITFindBy(xpath = "//*[@text='Australia']")
	private WebElement australiaButton;
	
	@AndroidFindBy(xpath = "//*[@text='Malaysia']")
	@iOSXCUITFindBy(xpath = "//*[@text='Malaysia']")
	private WebElement malaysiaButton;
	
	@AndroidFindBy(xpath = "//*[@text='Thailand']")
	@iOSXCUITFindBy(xpath = "//*[@text='Thailand']")
	private WebElement thailandButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	@iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement languageSelectorButton;
	
	@AndroidFindBy(xpath = "//*[@text='English']")
	@iOSXCUITFindBy(xpath = "//*[@text='English']")
	private WebElement englishButton;
	
	@AndroidFindBy(xpath = "//*[@text='ไทย']")
	@iOSXCUITFindBy(xpath = "//*[@text='ไทย']")
	private WebElement thaiButton;
	
	@AndroidFindBy(xpath = "//*[@text='Bahasa Melayu']")
	@iOSXCUITFindBy(xpath = "//*[@text='Bahasa Melayu']")
	private WebElement bahasaMelayuButton;
	
	@AndroidFindBy(xpath = "//*[@text='Daftar']")
	@iOSXCUITFindBy(xpath = "//*[@text='Daftar']")
	private WebElement daftarButton;
	
	@AndroidFindBy(xpath = "//*[@text='Log masuk']")
	@iOSXCUITFindBy(xpath = "//*[@text='Log masuk']")
	private WebElement logMasukButton;
	
	@AndroidFindBy(xpath = "//*[@text='ลงทะเบียน']")
	@iOSXCUITFindBy(xpath = "//*[@text='ลงทะเบียน']")
	private WebElement signUp_ThaiButton;
	
	@AndroidFindBy(xpath = "//*[@text='เข้าสู่ระบบ']")
	@iOSXCUITFindBy(xpath = "//*[@text='เข้าสู่ระบบ']")
	private WebElement logIn_ThaiButton;
	
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
	
	public LandingPage clickAustralia() {
		System.out.println("LandingPage > clickAustralia() was invoked.");
		
		//Store Web Element for australiaButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(australiaButton));
		System.out.println("Web Element for Australia was stored.");
		
		//Click Australia Button
		e.click();
		System.out.println("Australia Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickMalaysia() {
		System.out.println("LandingPage > clickMalaysia() was invoked.");
		
		//Store Web Element for malaysiaButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(malaysiaButton));
		System.out.println("Web Element for Malaysia was stored.");
		
		//Click Malaysia Button
		e.click();
		System.out.println("Malaysia Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickThailand() {
		System.out.println("LandingPage > clickThailand() was invoked.");
		
		//Store Web Element for clickThailand
		WebElement e = wait.until(ExpectedConditions.visibilityOf(thailandButton));
		System.out.println("Web Element for Thailand was stored.");
		
		//Click Thailand Button
		e.click();
		System.out.println("Thailand Button was clicked.");
		
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
	
	
	public LandingPage clickEnglish() {
		System.out.println("LandingPage > clickEnglish() was invoked.");
		
		//Store Web Element for englishButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(englishButton));
		System.out.println("Web Element for English Button was stored.");
		
		//Click English Button
		e.click();
		System.out.println("English Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickBahasaMelayu() {
		System.out.println("LandingPage > clickBahasaMelayuButton() was invoked.");
		
		//Store Web Element for clickBahasaMelayuButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(bahasaMelayuButton));
		System.out.println("Web Element for Bahasa Melayu Button was stored.");
		
		//Click Bahasa Melayu Button
		e.click();
		System.out.println("Bahasa Melayu Button was clicked.");
		
		return this;
	}
	
	public LandingPage clickThai() {
		System.out.println("LandingPage > clickThai() was invoked.");
		
		//Store Web Element for thaiButton
		WebElement e = wait.until(ExpectedConditions.visibilityOf(thaiButton));
		System.out.println("Web Element for thaiButton was stored.");
		
		//Click thaiButton
		e.click();
		System.out.println("Thai was clicked.");
		
		return this;
	}
	
	public LandingPage verifyCountriesAvailable(String[] countriesAvailable) {
		System.out.println("LandingPage > verifyCountriesAvailable() was invoked.");
		
		for (String country: countriesAvailable) {
			//Store Web Element for Country Option
			WebElement e = DriverManager.getDriver().findElementByXPath("//*[@text='"+country+"']");
			System.out.println("Web Element for Country Option '"+country+"' was stored.");
					
			//Assert if Country Option is equal to expected
			Assert.assertEquals(e.getText(), country);
			System.out.println("Assert completed for Country Option '"+country+"'.");
		}
		
		return this;
	}
	
	public LandingPage verifySupportedLanguagesPerCountry(String[] languageAvailable) {
		System.out.println("LandingPage > verifySupportedLanguagesPerCountry() was invoked.");
		
		for (String language: languageAvailable) {
			//Store Web Element for Language Option
			WebElement e = DriverManager.getDriver().findElementByXPath("//*[@text='"+language+"']");
					
			//Assert if Language Option is equal to expected
			Assert.assertEquals(e.getText(), language);
			System.out.println("Assert completed for Language Option '"+language+"'.");
		}
		return this;
	}
	
	public LandingPage verifyDaftarButtonIsPresent() {
		System.out.println("LandingPage > verifyDaftarButtonIsPresent() was invoked.");
		
		//Store Web Element for Daftar Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(daftarButton));
					
		//Assert if Daftar Button is displayed
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Daftar Button was verified to be displayed.");
		
		return this;
	}
	
	public LandingPage verifyLogMasukButtonIsPresent() {
		System.out.println("LandingPage > verifyLogMasukButtonIsPresent() was invoked.");
		
		//Store Web Element for Log Masuk Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(logMasukButton));
					
		//Assert if Log Masuk Button is displayed
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Log Masuk Button was verified to be displayed.");
		
		return this;
	}
	
	public LandingPage verifySignUpButtonIsPresent() {
		System.out.println("LandingPage > verifySignUpButtonIsPresent() was invoked.");
		
		//Store Web Element for Sign Up Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(signUpButton));
					
		//Assert if Sign Up Button is displayed
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Sign Up Button was verified to be displayed.");
		
		return this;
	}
	
	public LandingPage verifyLogInButtonIsPresent() {
		System.out.println("LandingPage > verifyLogInButtonIsPresent() was invoked.");
		
		//Store Web Element for Log In Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(loginButton));
					
		//Assert if Log In Button is displayed
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Log In Button was verified to be displayed.");
		
		return this;
	}
	
	public LandingPage verifySignUpThaiButtonIsPresent() {
		System.out.println("LandingPage > verifySignUpThaiButtonIsPresent() was invoked.");
		
		//Store Web Element for Sign Up Thai Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(signUp_ThaiButton));
					
		//Assert if Sign Up Thai Button is displayed
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Sign Up Thai Button was verified to be displayed.");
		
		return this;
	}
	
	public LandingPage verifyLogInThaiButtonIsPresent() {
		System.out.println("LandingPage > verifyLogInThaiButtonIsPresent() was invoked.");
		
		//Store Web Element for Log In Thai Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(logIn_ThaiButton));
					
		//Assert if Log In Thai Button is displayed
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Log In Thai Button was verified to be displayed.");
		
		return this;
	}
}
