package com.opencart.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	//Variables Initialization 
	private Properties prop ;
	
	//Init method
	public Properties init_prop() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\OpenCartDemoProject\\src\\main\\java"
					+ "\\com\\opencart\\config\\config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}		
		return prop;	
	}

}
