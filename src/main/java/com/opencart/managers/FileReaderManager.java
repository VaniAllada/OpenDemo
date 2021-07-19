package com.opencart.managers;

import com.opencart.managers.FileReaderManager;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static com.opencart.extentreport.ConfigFileReader configFileReader;

	private FileReaderManager() {
	}

	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public com.opencart.extentreport.ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new com.opencart.extentreport.ConfigFileReader() : configFileReader;
	 }

}
