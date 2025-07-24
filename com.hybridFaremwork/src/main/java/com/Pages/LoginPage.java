package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Configure.PropertiesReader;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passWord;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;

	@FindBy(xpath = "//div[4]//p[text()='Forgot Your Password? ']")
	private WebElement forgotpassWord;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void inputUsername() throws Exception 
	{
		String Username = PropertiesReader.getConfigureWeb("user");
		userName.sendKeys(Username);
	}
	
	public void inputPassword () throws Exception
	{
		String Password =  PropertiesReader.getConfigureWeb("pass");
		passWord.sendKeys(Password);
	}
	
	public void login ()
	{
		loginButton.click();
	}

}
