package com.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//span[text ()= 'Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//span[text ()= 'Admin']")
	private WebElement admin;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		PageFactory.initElements(driver, this);
	}

	public void isSelectedDashboard() {
		dashboard.isSelected();
	}
	
	public void clickAdmin()
	{
		admin.click();
	}
	
	public void isSelectedAdmin()
	{
		admin.isSelected();
	}
}
