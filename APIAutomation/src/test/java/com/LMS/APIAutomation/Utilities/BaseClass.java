/**
 * 
 */
package com.LMS.APIAutomation.Utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;

import com.LMS.APIAutomation.Resources.ReadProperties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

/**
 * @author sa185402
 *
 */
public class BaseClass {
	public static RequestSpecification req;
	ReadProperties prop = new ReadProperties();
//	public static org.apache.log4j.Logger logger = LogManager.getLogger("API Automation");
	
	
	public RequestSpecification RequestSpecification() throws FileNotFoundException {
		//logger.info("Hello");
		if(req == null) {
			PrintStream log = new PrintStream(new FileOutputStream("Responselog.txt"));
			req = new RequestSpecBuilder().setBaseUri(prop.getBaseURL())
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setContentType("text/xml").build();
			//return req;
		}
//		log = Logger.getLogger(BaseClass.class.getName());
//		PropertyConfigurator.configure("Log4j.properties");
		//logger.info("Hello");	
		return req;
		
	}
	//res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.XML).build();
	//.then().spec(res).extract().response();

}
