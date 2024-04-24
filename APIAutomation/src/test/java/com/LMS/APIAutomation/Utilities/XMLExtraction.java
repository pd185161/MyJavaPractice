/**
 * 
 */
package com.LMS.APIAutomation.Utilities;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.LMS.APIAutomation.Resources.Log4j;
import com.LMS.APIAutomation.Resources.ReadProperties;

import io.restassured.response.ResponseBody;

import org.apache.log4j.LogManager;
import org.w3c.dom.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * @author sa185402
 *
 */
public class XMLExtraction {
	
	 DocumentBuilderFactory documentBuilderFactory;
	 DocumentBuilder documentBuilder;
	 Document document;
	 ReadProperties prop = new ReadProperties();
	
	public String Extraction(ResponseBody Response, String TagName, int index, String Attribute) throws SAXException, IOException, ParserConfigurationException {
		
//		System.out.println(Response.asPrettyString());
		String NodeValue = null;
		
		documentBuilderFactory = DocumentBuilderFactory.newInstance();
		documentBuilderFactory.setNamespaceAware(false); //optional; only if needed
		documentBuilderFactory.setValidating(false); //optional; only if needed
		documentBuilder = documentBuilderFactory.newDocumentBuilder();
		
		document = documentBuilder.parse(new InputSource(new StringReader(Response.asString())));
//		"UserLoginResult"
		NodeList dependencyElements = document.getElementsByTagName(TagName);
		Node node = dependencyElements.item(index);
		
//		String Str = dependencyElements.item(0).getTextContent();
//		System.out.println(Str);

		if(node.getNodeType() == Node.ELEMENT_NODE){
			Element eElement = (Element) node;
//			System.out.println( "eElement Length" + eElement.getChildNodes().getLength());
//			System.out.println("eElement, getAttributes Length" +eElement.getAttributes().getLength());
			
			if(eElement.getChildNodes().getLength() > 0) {
				NodeValue = dependencyElements.item(index).getTextContent();
				Log4j.loginfo("Node Value is : " + NodeValue);
			}
			
			if(eElement.getAttributes().getLength() > 0) {
				if(eElement.getAttributes().getNamedItem(Attribute) != null){
					NodeValue = eElement.getAttributes().getNamedItem(Attribute).getNodeValue();
				 	//System.out.println(NodeValue);
					Log4j.loginfo("Node Value is : " + NodeValue);
				}
			}
		}
		
		return NodeValue;
		
	}

	
	public void updateXMLFile(String xmlFileName, String tagName, String attribute, String updateValue) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		//String XMLFile = "C:\\Manoj\\ManojJMeter\\LMS\\ILoader\\Import-01-2021-12-21T144204-GT.xml";
		String XMLFile = prop.getIloader_XML_File_Path() + "\\" + xmlFileName;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//API to obtain DOM Document instance
		DocumentBuilder builder = null;
		//Create DocumentBuilder with default configuration
		builder = factory.newDocumentBuilder();
		//Parse the content to Document object
		Document doc = builder.parse(new File(XMLFile));
		NodeList dependencyElements = doc.getElementsByTagName(tagName);
	

		for(int i=0;i<dependencyElements.getLength();i++)
		{
			Node node = dependencyElements.item(i);
			
			if(node.getNodeType() == Node.ELEMENT_NODE){
			 Element eElement = (Element) node;
			 eElement.getAttributes().getNamedItem(attribute).setTextContent(updateValue);
			 String HeaderId = eElement.getAttributes().getNamedItem(attribute).getNodeValue();
			 System.out.println(HeaderId);
			 TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         	 Transformer transformer = transformerFactory.newTransformer();
	         	 DOMSource source = new DOMSource(doc);
	         	 StreamResult consoleResult = new StreamResult(new File(XMLFile));
	         	 transformer.transform(source, consoleResult);
				}
		}
	}
}
