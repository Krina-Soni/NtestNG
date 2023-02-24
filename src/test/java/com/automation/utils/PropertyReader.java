package com.automation.utils;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertyReader {
	static Properties prop;

	public static void initProperty() {
		try {
			prop = new Properties();
			prop.load(new FileInputStream("C://Users//krina//eclipse-workspace//TestNGFramework//src//test//resources//config//configuration.properties"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}