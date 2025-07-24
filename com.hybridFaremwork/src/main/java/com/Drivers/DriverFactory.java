package com.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    
//    public WebDriver getDriver() {
//    	return driver.get();
//    }

	public static WebDriver initDriver(String browserName) 
	{
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			break;
		
		case "frirefox":
			WebDriverManager.firefoxdriver().setup();
			break;
			
		case "safari":
			WebDriverManager.safaridriver().setup();
			break;
			
		default:
			throw new IllegalArgumentException("Unsupported browser: "+ browserName);
			
		}
		return driver.get();
	}
	
//	public static WebDriver getDriver() {
//        return driver.get();
//	}
	public static void tearDown() {
		driver.get().quit();
		driver.remove();
	}

}
