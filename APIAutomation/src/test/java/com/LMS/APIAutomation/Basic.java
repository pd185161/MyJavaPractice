package com.LMS.APIAutomation;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import javax.xml.xpath.*;

import org.w3c.dom.*;

public class Basic {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		
//		RestAssured.baseURI = "http://153.77.180.130/";
//		String Response = given().log().all().header("Content-Type","text/xml").body("<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\r\n"
//				+ "  <soap:Body>\r\n"
//				+ "    <UserLogin xmlns=\"http://www.retalix.com/HQLWebServices\">\r\n"
//				+ "      <in_UserName>HQL</in_UserName>\r\n"
//				+ "      <in_Password>Abcd123</in_Password>\r\n"
//				+ "    </UserLogin>\r\n"
//				+ "  </soap:Body>\r\n"
//				+ "</soap:Envelope>").when().post("LoyaltyOnlineWS/Authorization/Login.asmx")
//		.then().log().all().assertThat().statusCode(200).extract().response().asString();
//		System.out.println(Response);
		
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//	    DocumentBuilder builder = factory.newDocumentBuilder();
//	    InputSource is = new InputSource(new StringReader(Response));
//	    System.out.println( builder.parse(is));
//	    Document doc = builder.parse(is);
//	    NodeList dependencyElements = doc.getElementsByTagName("out_SessionKey");
//		String Str = dependencyElements.item(0).getNodeName();
//	    System.out.println(Str);
//		XmlPath xm = new XmlPath(Response);
//		System.out.println(xm.getString("Status"));
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("http://153.77.180.130/").setContentType("text/xml").build();
		ResponseSpecification response = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.XML).build();
		RequestSpecification res = given().spec(req).body("<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\r\n"
				+ "  <soap:Body>\r\n"
				+ "    <UserLogin xmlns=\"http://www.retalix.com/HQLWebServices\">\r\n"
				+ "      <in_UserName>HQL</in_UserName>\r\n"
				+ "      <in_Password>Abcd123</in_Password>\r\n"
				+ "    </UserLogin>\r\n"
				+ "  </soap:Body>\r\n"
				+ "</soap:Envelope>");
		Response respon = res.when().post("LoyaltyOnlineWS/Authorization/Login.asmx").then().spec(response).extract().response();
		
		String Response = respon.asString();
		System.out.println(Response);

		
	}

}
