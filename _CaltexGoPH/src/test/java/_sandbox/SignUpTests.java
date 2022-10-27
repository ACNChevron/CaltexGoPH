package _sandbox;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;

public class SignUpTests extends BaseTest {
	@Test
	public void SignUp() throws InterruptedException {
		LandingPage landingPage = new LandingPage();
		
		landingPage.clickSignUp();
		
	}
}
