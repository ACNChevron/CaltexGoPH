package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EnterPasswordHereToLoginPage extends BasePage {
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	@iOSXCUITFindBy(xpath = "//*[@class='android.widget.EditText']")
	private WebElement passwordField;
	
	@AndroidFindBy(xpath = "//*[@text='Login']")
	@iOSXCUITFindBy(xpath = "//*[@text='Login']")
	private WebElement loginButton;
	
	public EnterPasswordHereToLoginPage enterPassword(String password) {
		System.out.println("EnterPasswordHereToLoginPage > enterPassword() was invoked.");
		
		//Store Web Element for Password Field
		WebElement e = wait.until(ExpectedConditions.visibilityOf(passwordField));
		System.out.println("Web Element for Password Field was stored.");
		
		//Enter Password
		e.sendKeys(password);
		System.out.println("Password was entered.");

		return this;
	}
	
	public EnterPasswordHereToLoginPage clickLogin() {
		System.out.println("EnterPasswordHereToLoginPage > clickLogin() was invoked.");
		
		//Store Web Element for Login Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(loginButton));
		System.out.println("Web Element for Login Button was stored.");
		
		//Click Login Button
		e.click();
		System.out.println("Login Button was clicked.");

		return this;
	}
}
