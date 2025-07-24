package com.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddJob {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//span[text()='Job']")
	private WebElement job;
	
	@FindBy(xpath = "//u[@Role='menu']")
	private WebElement jobMenu;
	
	@FindBy(xpath = "")
	private WebElement addFile;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement add;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input-active'])[2]")
	private WebElement jobTitle;
	
	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	private WebElement jobDesc;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement jobSpec;
	
	@FindBy(xpath = "//textarea[@placeholder='Add note']")
	private WebElement note;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancel;
	
	@FindBy(xpath = "//button[@type='sumbit']")
	private WebElement submit;
	
	@FindBy(xpath = "(//div[@role='rowgroup'])[2]")
	private WebElement rowGroup;
	
	public AddJob(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait (driver, Duration.ofSeconds(10));
	}
	
	public void clickonJob()
	{
		job.click();
	}
	
	public void clickonJobMenu()
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(jobMenu));
	}
	
	public void clickonAdd()
	{
		add.click();
	}
	
	public void addjobTitle()
	{
		
	}
}
