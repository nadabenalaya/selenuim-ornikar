package com.e2eTests.automation.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationOrnikPage {
	public WebDriver driver;
	
	/*@FindBy*/
	@FindBy(how=How.XPATH, using="//*[@data-testid='connection-button']")
	public static WebElement authentication;
	@FindBy(how=How.XPATH, using="//*[@data-testid='modal-title']")
	public static WebElement pageauthentication;
	@FindBy(how=How.ID, using="email")
	public static WebElement userName;
	@FindBy(how=How.ID, using="password")
	public static WebElement password;
	@FindBy(how=How.XPATH, using="//button[@class=\"kitt_Button_J65Ds kitt_ResetButton_1dTnc kitt_Primary_1ZGLH             kitt_Stretch_2ROFw  \"]")
	public static WebElement btnLogin;
	@FindBy(how=How.XPATH, using="//span[contains(text(),'amira' )]")
	public static WebElement welcome;

	/*Methods*/
	public void clickAuthenticationButton() throws InterruptedException {
		Thread.sleep(7000);
		authentication.click();
		//boolean result = pageauthentication.isDisplayed();
		//Assert.assertTrue(result);
	}
	public void fillUsername() {
		userName.sendKeys("khaoulabenalayaa@outlook.fr");
	}
	public void fillPassword() {
		password.sendKeys("789456123Aa@");
	}
	public void clickLoginButton() {
		btnLogin.click();
		
	}

	public void  verifauthentification() {
		String textuser= welcome.getText();
		Assert.assertEquals("amira", textuser );
		}

}
