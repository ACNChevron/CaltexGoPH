package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import base.DriverManager;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utils.AccessDatasheet;

public class EditProfilePage extends BasePage{
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='First Name']]")
	@iOSXCUITFindBy(xpath = "//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='First Name']]")
	private WebElement firstNameField;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Last Name']]")
	@iOSXCUITFindBy(xpath = "//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Last Name']]")
	private WebElement lastNameField;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Email Address']]")
	@iOSXCUITFindBy(xpath = "//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='Email Address']]")
	private WebElement emailField;
	
	@AndroidFindBy(xpath = "//*[@text='Save']")
	@iOSXCUITFindBy(xpath = "//*[@text='Save']")
	private WebElement saveButton;
	
	@AndroidFindBy(xpath = "//*[@text='First Name should not contain special characters']")
	@iOSXCUITFindBy(xpath = "//*[@text='First Name should not contain special characters']")
	private WebElement firstNameShouldNotContainSpecialCharacters;
	
	@AndroidFindBy(xpath = "//*[@text='Last Name should not contain special characters']")
	@iOSXCUITFindBy(xpath = "//*[@text='Last Name should not contain special characters']")
	private WebElement lastNameShouldNotContainSpecialCharacters;
	
	@AndroidFindBy(xpath = "//*[@text='Birth Month and Year']")
	@iOSXCUITFindBy(xpath = "//*[@text='Birth Month and Year']")
	private WebElement birthMonthAndYearField;
	
	@AndroidFindBy(xpath = "//*[@text='Mobile Number']")
	@iOSXCUITFindBy(xpath = "//*[@text='Mobile Number']")
	private WebElement mobileNumberField;
	
	@AndroidFindBy(xpath = "//*[@text='Please contact our Customer Service Center to change your birthday or mobile number']")
	@iOSXCUITFindBy(xpath = "//*[@text='Please contact our Customer Service Center to change your birthday or mobile number']")
	private WebElement popUpModal;
	
	@AndroidFindBy(xpath = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ScrollView']]]")
	@iOSXCUITFindBy(xpath = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ScrollView']]]")
	private WebElement closePopUpModalButton;
	
	@AndroidFindBy(xpath = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@id='EditProfileScreen']]]")
	@iOSXCUITFindBy(xpath = "//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@id='EditProfileScreen']]]")
	private WebElement backButton;
	
	@AndroidFindBy(xpath = "//*[@text='Yes, leave without saving']")
	@iOSXCUITFindBy(xpath = "//*[@text='Yes, leave without saving']")
	private WebElement yesLeaveButton;
	
	public EditProfilePage enterNewFirstName (String newFirstName) {
		System.out.println("EditProfilePage > enterNewFirstName() was invoked.");
		
		//Store Web Element for First Name Field
		WebElement e = wait.until(ExpectedConditions.visibilityOf(firstNameField));
		System.out.println("Web Element for First Name Field was stored.");
		
		//Clear First Name field
		e.clear();
		System.out.println("First Name Field was cleared.");
		
		//Enter New First Name
		e.sendKeys(newFirstName);
		System.out.println("New First Name was entered.");

		return this;
	}
	
	public EditProfilePage enterNewLastName (String newLastName) {
		System.out.println("EditProfilePage > enterNewLastName() was invoked.");
		
		//Store Web Element for Last Name Name Field
		WebElement e = wait.until(ExpectedConditions.visibilityOf(lastNameField));
		System.out.println("Web Element for Last Name Field was stored.");
		
		try {
			//Clear Last Name field
			e.clear();
			System.out.println("Last Name Field was cleared.");
		} catch (Exception exClear) {
			// TODO Auto-generated catch block
			exClear.printStackTrace();
		}
		
		try {
			//Enter New Last Name
			e.sendKeys(newLastName);
			System.out.println("New Last Name was entered.");
		} catch (Exception exSendKeys) {
			// TODO Auto-generated catch block
			exSendKeys.printStackTrace();
		}

		return this;
	}
	
	public EditProfilePage clickSave() {
		System.out.println("EditProfilePage > clickSave() was invoked.");
		
		//Store Web Element for Save  Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(saveButton));
		System.out.println("Web Element for Save Button was stored.");
		
		//Click Save Button
		e.click();
		System.out.println("Save Button was clicked.");

		return this;
	}
	
	public EditProfilePage changeEmail(String[] emailAddressOptions) throws IOException {
		System.out.println("EditProfilePage > changeEmail() was invoked.");
		
		//Declare Datasheet
		AccessDatasheet datasheet = new AccessDatasheet();
		System.out.println("Datasheet was declared.");
		
		//Store Web Element for Change Email Field
		WebElement e = wait.until(ExpectedConditions.visibilityOf(emailField));
		System.out.println("Web Element for Email Field was stored.");
		
		//Stor flag number for the current Email Address used
		int flagEmailAddress = 0;
		for (int i=0;i<emailAddressOptions.length;i++) {
			if(emailAddressOptions[i].equals(e.getText())) flagEmailAddress=i;
		}
		System.out.println("Flag Email Address '"+flagEmailAddress+"' was stored.");
		
		//Store Email Address for Change
		String emailAddress_Change = null;
		switch(flagEmailAddress) {
		case 0: emailAddress_Change = emailAddressOptions[1]; break;
		case 1: emailAddress_Change = emailAddressOptions[0]; break;
		}
		System.out.println("Email Address Change '"+emailAddress_Change+"' was stored.");
		
		//Click Email Address Field
		e.click();
		System.out.println("Email Address Field was clicked.");
		
		try {
			//Clear Email Address Field
			e.clear();
			System.out.println("Email Address Field was cleared.");
		} catch (Exception ex_clear) {
			// TODO Auto-generated catch block
			ex_clear.printStackTrace();
		}
		
		//Hide Keyboard
		DriverManager.getDriver().hideKeyboard();
		
		try {
			//Enter Email Address Change
			e.sendKeys(emailAddress_Change);
			System.out.println("Email Address '"+emailAddress_Change+"' was entered.");
		} catch (Exception ex_sendKeys) {
			// TODO Auto-generated catch block
			ex_sendKeys.printStackTrace();
		}
		
		//Update Email Address in Global Datasheet Credentials
		datasheet.WriteGlobalTestData("Credentials", "Email Address", emailAddress_Change);
		System.out.println("Email Address '"+emailAddress_Change+"' was updated in Global Datasheet Credentials.");
		
		return this;
	}
	
	public EditProfilePage verifyErrorMessage_FirstNameShouldNotContainSpecialCharacters() {
		System.out.println("EditProfilePage > verifyErrorMessage_FirstNameShouldNotContainSpecialCharacters() was invoked.");
		
		//Store Web Element for firstNameShouldNotContainSpecialCharacters
		WebElement e = wait.until(ExpectedConditions.visibilityOf(firstNameShouldNotContainSpecialCharacters));
		System.out.println("Web Element for firstNameShouldNotContainSpecialCharacters was stored.");
		
		//Verify if Last Name Should Not Contain Special Characters
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Error Message was verified displayed.");

		return this;
	}
	
	public EditProfilePage verifyErrorMessage_LastNameShouldNotContainSpecialCharacters() {
		System.out.println("EditProfilePage > verifyErrorMessage_LastNameShouldNotContainSpecialCharacters() was invoked.");
		
		//Store Web Element for lastNameShouldNotContainSpecialCharacters
		WebElement e = wait.until(ExpectedConditions.visibilityOf(lastNameShouldNotContainSpecialCharacters));
		System.out.println("Web Element for lastNameShouldNotContainSpecialCharacters was stored.");
		
		//Verify if Last Name Should Not Contain Special Characters
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Error Message was verified displayed.");

		return this;
	}
	
	public EditProfilePage clickBirthMonthAndYear() {
		System.out.println("EditProfilePage > clickBirthMonthAndYear() was invoked.");
		
		//Store Web Element for Birth Month And Year Field
		WebElement e = wait.until(ExpectedConditions.visibilityOf(birthMonthAndYearField));
		System.out.println("Web Element for Birth Month And Year Field was stored.");
		
		//Click Birth Month And Year Field
		e.click();
		System.out.println("Birth Month And Year Field was clicked.");

		return this;
	}
	
	public EditProfilePage clickMobileNumber() {
		System.out.println("EditProfilePage > clickMobileNumber() was invoked.");
		
		//Store Web Element for Mobile Number
		WebElement e = wait.until(ExpectedConditions.visibilityOf(mobileNumberField));
		System.out.println("Web Element for Mobile Number Field was stored.");
		
		//Click Mobile Number Field
		e.click();
		System.out.println("Mobile Number Field was clicked.");

		return this;
	}
	
	public EditProfilePage verifyPopUpModal() {
		System.out.println("EditProfilePage > verifyPopUpModal() was invoked.");
		
		//Store Web Element for Pop Up Modal
		WebElement e = wait.until(ExpectedConditions.visibilityOf(popUpModal));
		System.out.println("Web Element for Pop Up Modal was stored.");
		
		//Verify if Pop Up Modal is displayed
		Assert.assertEquals(e.isDisplayed(), true);
		System.out.println("Pop Up Modal was verified to be displayed.");

		return this;
	}
	
	public EditProfilePage closePopUpModal() {
		System.out.println("EditProfilePage > closePopUpModal() was invoked.");
		
		//Store Web Element for Close Pop Up Modal
		WebElement e = wait.until(ExpectedConditions.visibilityOf(closePopUpModalButton));
		System.out.println("Web Element for Close Pop Up Modal was stored.");
		
		//Click Close Pop Up Modal
		e.click();
		System.out.println("Close Pop Up Modal was clicked.");

		return this;
	}
	
	public EditProfilePage clickBack() {
		System.out.println("EditProfilePage > clickBack() was invoked.");
		
		//Store Web Element for Back Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(backButton));
		System.out.println("Web Element for Back Button was stored.");
		
		//Click Back Button
		e.click();
		System.out.println("Back Button was clicked.");

		return this;
	}
	
	public EditProfilePage clickYesLeave() {
		System.out.println("EditProfilePage > clickYesLeave() was invoked.");
		
		//Store Web Element for Yes Leave Button
		WebElement e = wait.until(ExpectedConditions.visibilityOf(yesLeaveButton));
		System.out.println("Web Element for Yes Leave Button was stored.");
		
		//Click Yes Leave Button
		e.click();
		System.out.println("Yes Leave Button was clicked.");

		return this;
	}
}
