package com.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	public static void takeScreenshot(WebDriver driver, String testName) {
		String timestamp = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date());

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destPath = System.getProperty("user.dir") + "\\screenshots" + testName + "_" + timestamp + ".png";

		try {
			FileUtils.copyFile(srcFile, new File(destPath));
			System.out.println("Screenshot saved to: " + destPath);
		} catch (IOException e) {
			System.err.println("Error saving screenshot: " + e.getMessage());
		}
	}

}
