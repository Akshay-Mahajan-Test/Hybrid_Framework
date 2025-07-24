package com.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewAdmin {
	
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//button[text ()= ' Add ']")
	private WebElement add;
	
	@FindBy (xpath = "(//div[text ()= '-- Select --'])[1]")
	private WebElement userRole;
	
	@FindBy (xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeeName;
	
	@FindBy (xpath = "")
	private WebElement listbox;
	
	@FindBy (xpath = "(//div[text ()= '-- Select --'])[2]")
	private WebElement status;
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
	
	@FindBy (xpath = "(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy (xpath = "//button[text()=' Cancel ']")
	private WebElement cancel;
	
	public AddNewAdmin(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdd()
	{
		wait.until(ExpectedConditions.elementToBeClickable(add)).click();
	}
	
	public void selectUserRole()
	{
		wait.until(ExpectedConditions.elementToBeClickable(userRole)).isDisplayed();
		Select sel = new Select(userRole);
		sel.selectByValue(null);
		
	}	
	
	public void addEmployeeName(String Prefix)
	{
		employeeName.clear();
		employeeName.sendKeys(Prefix);
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(suggestionList));
		
	}
	
	
	
}
