package com.Drivers;

import java.io.File;

import org.testng.annotations.*;

import com.Configure.PropertiesReader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class AppiumDriverManager {
	private static AppiumDriver driver;

	public static AppiumDriver getDriver() {
		return driver;
	}

	@AfterTest
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	@Parameters ({"platformName", "platformVersion", "deviceName"})
	@BeforeTest
	public static AppiumDriver initDriver(String platformName,  String platformVersion, String deviceName) throws Exception {
		switch (platformName) {
		case "Android":
			String apkUrl = System.getProperty("user.dir") + File.separator
					+ PropertiesReader.getConfigureAndroid("androidApp");
			UiAutomator2Options ops = new UiAutomator2Options()
					.setPlatformVersion(platformVersion)
					.setDeviceName(deviceName)
					.setApp(apkUrl);
			driver = new AndroidDriver(ops);
			break;

		case "iOS":
			String ipkUrl = System.getProperty("user.dir") + File.separator + "apk" + File.separator + ".ipa";
			XCUITestOptions ops1 = new XCUITestOptions()
					.setPlatformName(platformName)
					.setDeviceName(deviceName)
					.setApp(ipkUrl);
			driver = new IOSDriver(ops1);
			break;

		default:
			throw new Exception("No valid platform");

		}
		return driver;
	}
}
