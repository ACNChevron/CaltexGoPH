package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPage extends BasePage{
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement changePasswordLink;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement backButton;
	
	public SettingsPage clickChangePassword() {
		System.out.println("SettingsPage > clickChangePassword() was invoked.");
		
		//Store Web Element for Change Password Link
		WebElement e = wait.until(ExpectedConditions.visibilityOf(changePasswordLink));
		System.out.println("Web Element for Change Password Link was stored.");
		
		//Click Change Password Link
		e.click();
		System.out.println("Change Password was clicked.");

		return this;
	}
	
	public SettingsPage clickBack() {
		System.out.println("SettingsPage > clickBack() was invoked.");
		
		//Store Web Element for Change Password Link
		WebElement e = wait.until(ExpectedConditions.visibilityOf(backButton));
		System.out.println("Web Element for Back Button was stored.");
		
		//Click Back Button
		e.click();
		System.out.println("Back Button was clicked.");

		return this;
	}
}
