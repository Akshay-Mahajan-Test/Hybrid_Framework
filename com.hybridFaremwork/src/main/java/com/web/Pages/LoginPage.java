package com.web.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;

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
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void inputUsername(String User)
	{
		userName.sendKeys(User);
	}
	
	public void inputPassword (String Pass)
	{
		passWord.sendKeys(Pass);
	}
	
	public void login ()
	{
		loginButton.click();
	}

}
