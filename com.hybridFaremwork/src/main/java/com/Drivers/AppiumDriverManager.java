package com.Drivers;

import java.io.File;

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

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public static AppiumDriver initDriver(String Platform) throws Exception {
		switch (Platform) {
		case "Android":
			String apkUrl = System.getProperty("user.dir") + File.separator + "apk" + File.separator
					+ "ApiDemos-debug.apk";
			UiAutomator2Options ops = new UiAutomator2Options()
					.setPlatformName(PropertiesReader.getConfigureAndroid("platformname"))
					.setDeviceName(PropertiesReader.getConfigureAndroid("devicename"))
					.setPlatformVersion(PropertiesReader.getConfigureAndroid("platformversion"))
					.setApp(apkUrl);
			driver = new AndroidDriver(ops);
			break;
			
		case "iOS":
			String ipkUrl = System.getProperty("user.dir") + File.separator + "apk" + File.separator + ".ipa";
			XCUITestOptions ops1 = new XCUITestOptions().setPlatformName(PropertiesReader.getConfigureiOS("platform"))
					.setDeviceName(null).setApp(ipkUrl);
			driver =  new IOSDriver(ops1);
			break;

		default:
			throw new Exception("No valid platform");

		}
		return driver;
	}
}
