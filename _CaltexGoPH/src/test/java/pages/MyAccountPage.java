package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAccountPage extends BasePage {
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement settingsButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.TextView")
	private WebElement logOutButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	private WebElement yesButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement editProfileButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
	private WebElement loyaltyProgram;
	
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
		WebElement e = wait.until(ExpectedConditions.visibilityOf(loyaltyProgram));
		System.out.println("Web Element for Loyalty Program Button was stored.");
		
		//Click Loyalty Program Button
		e.click();
		System.out.println("Loyalty Program Button was clicked.");

		return this;
	}	
	
}
