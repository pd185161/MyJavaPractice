package JavaCodePractice;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class Practice3 {

	public static void main(String[] args) {
		// year to be checked
	    try
	    {
		boolean bool;
		
		String xsdPath = "C:\\Users\\pd185161\\OneDrive - NCR Corporation\\Desktop\\LP\\XML schemas\\UploadOnline.xsd";
		bool = isValid(xsdPath,"C:\\Users\\pd185161\\OneDrive - NCR Corporation\\Desktop\\Msg3_312.xml");
		
		System.out.println(bool);
	    }
	    catch(Exception ex)
	    {
	    	ex.getStackTrace();
	    }
}
	
	
	private static Validator initValidator(String xsdPath) throws SAXException {
	    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	    Source schemaFile = new StreamSource(getFile(xsdPath));
	    Schema schema = factory.newSchema(schemaFile);
	    return schema.newValidator();
	}
	
	private static File getFile(String location) {
	    //return new File(getClass().getClassLoader().getResource(location).getFile());
		return new File(location);
	}
	
	public static boolean isValid(String xsdPath, String xmlPath) throws IOException, SAXException {
	    Validator validator ;
	    try {
	    	validator = initValidator(xsdPath);
	        validator.validate(new StreamSource(getFile(xmlPath)));
	        return true;
	    } catch (SAXException e) {
	        return false;
	    }
	}
}