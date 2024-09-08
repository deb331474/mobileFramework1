package org.rahulshettyacademy;

import org.testng.annotations.Test;
import org.rahulshettyacademy.TestUtils.AndroidBaseTest;
import org.testng.annotations.Test;

public class Mc_tcLogin_1 extends AndroidBaseTest{
	
	@Test
	public void loginToUser() {
		
		mentor_Connect_LoginPage.clickOnLoginBtn();
		mentor_Connect_LoginPage.enterEmailAddress("demo3.mentor1@comp.com");
		mentor_Connect_LoginPage.enterPassword("Teagreen827!");
		mentor_Connect_LoginPage.clickonLogin();
	}

}
