package org.rahulshettyacademy.pageObjects.android;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.rahulshettyacademy.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Mentor_Connect_LoginPage extends AndroidActions{
	
	 AndroidDriver driver;

	    public Mentor_Connect_LoginPage(AndroidDriver driver) {
	        super(driver);
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }

	    @AndroidFindBy(accessibility = "LOG IN")
	    private WebElement loginBtn;

	    @AndroidFindBy(uiAutomator = "new UiSelector().text('Email Address (ex. john@xyz.com)')")
	    private WebElement emailAddr;

	    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
	    private WebElement password;

	    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
	    private WebElement logInLnk;

	    public void clickOnLoginBtn() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	    }

	    public void enterEmailAddress(String email) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(emailAddr)).sendKeys(email);
	    }

	    public void enterPassword(String pwd) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pwd);
	    }

	    public void clickonLogin() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(logInLnk)).click();
	    }
	}
