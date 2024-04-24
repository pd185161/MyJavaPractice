/**
 * 
 */
package com.LMS.APIAutomation.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author sa185402
 *
 */
public class ReadProperties {
	
Properties prop;
	
	public ReadProperties() {
		prop = new Properties();
		try {
		File src = new File("./Configuration/EnvironmentVariables.properties");
		FileInputStream fis = new FileInputStream(src);
		prop.load(fis);
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	public String getBaseURL() {
		return prop.getProperty("BaseUrl");
	}
	
	public String getServer() {
		return prop.getProperty("Server");
	}
	
	public String getServerUserName() {
		return prop.getProperty("ServerUserName");
	}
	
	public String getServerPassword() {
		return prop.getProperty("ServerPassword");
	}
	
	public String getServerExeLoader() {
		return prop.getProperty("Server_Exe_Loader");
	}
	
	public String getIloader_BATFile_Path() {
		return prop.getProperty("Iloader_BATFile_Path");
	}
	
	public String getIloader_XML_File_Path() {
		return prop.getProperty("Iloader_XML_File_Path");
	}
	
	public String getIloader_Server_IN_Path() {
		return prop.getProperty("Iloader_Server_IN_Path");
	}
}
