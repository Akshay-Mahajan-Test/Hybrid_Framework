package com.Configure;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

	public static String PROPFILEPATH_1 = System.getProperty("user.dir") + File.separator + "configuration"
			+ File.separator + "WebConfig.properties";
//	public static String PROPFILEPATH_1 = System.getProperty("/com.hybridFaremwork/configuration/WebConfig.properties");
	public static String PROPFILEPATH_2 = System.getProperty("user.dir") + File.separator + "configuration"
			+ "AndroidConfig.properties";
	public static String PROPFILEPATH_3 = System.getProperty("user.dir") + File.separator + "configuration"
			+ "iOSConfig.properties";
	public static String FILEPATH = System.getProperty("user.dir") + File.separator + "resources" + File.separator
			+ "User_Details_HY.xlsx";

	public static String getValue(String filepath, String key) throws Exception {
		FileInputStream fis = new FileInputStream(filepath);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public static String getConfigureWeb(String key) throws Exception {
		return getValue(PROPFILEPATH_1, key);
	}

	public static String getConfigureAndroid(String key) throws Exception {
		return getValue(PROPFILEPATH_2, key);
	}

	public static String getConfigureiOS(String key) throws Exception {
		return getValue(PROPFILEPATH_3, key);
	}
}
