/**
 * 
 */
package com.LMS.APIAutomation.Resources;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author sa185402
 *
 */
public class Log4j {
	
	public static org.apache.log4j.Logger logger = LogManager.getLogger("API Automation");
	
	
	public static void loginfo(String lnfo) {
		PropertyConfigurator.configure("Log4j.properties");
		logger.info(lnfo);
	}
	
	public static void Warn(String warn) {
		PropertyConfigurator.configure("Log4j.properties");
		logger.warn(warn);
	}
	
	public static void error(String error) {
		PropertyConfigurator.configure("Log4j.properties");
		logger.error(error);
	}
	
}
