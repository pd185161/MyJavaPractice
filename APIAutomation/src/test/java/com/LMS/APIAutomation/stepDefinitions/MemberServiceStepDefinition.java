/**
 * 
 */
package com.LMS.APIAutomation.stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

//import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import com.LMS.APIAutomation.RequestPayload.MemberServiceRequestPayLoad;
import com.LMS.APIAutomation.Utilities.BaseClass;
import com.LMS.APIAutomation.Utilities.EndPointURLS;
import com.LMS.APIAutomation.Utilities.XMLExtraction;
import com.LMS.APIAutomation.Resources.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

/**
 * @author sa185402
 *
 */
public class MemberServiceStepDefinition extends BaseClass {
	
	RequestSpecification req;
	ResponseSpecification res;
	Response response;
	static String sessionId;
	XMLExtraction xmlExtract = new XMLExtraction();
	
	@Given("Add Login Payload UserName {string} Password {string}")
	public void add_login_payload_user_name_password(String UserName, String Password) throws FileNotFoundException {
	    // Write code here that turns the phrase above into concrete actions
		req = given().spec(RequestSpecification()).body(MemberServiceRequestPayLoad.loginRequest(UserName, Password));
		Log4j.loginfo("Built Request Specification of Login with UserName "+UserName+ " Password "+Password );
	}
	@When("user call {string} API with {string} http request")
	public void user_call_api_with_http_request(String resources, String method) {
	    // Write code here that turns the phrase above into concrete actions
		EndPointURLS APIResources = EndPointURLS.valueOf(resources);
		response = req.when().post(APIResources.getResources());
		Log4j.loginfo("Login Request Sent to server ");
				
	}
	@Then("the API call got success with status {int}")
	public void the_api_call_got_success_with_status(Integer int1){
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(response.getStatusCode(), 200);
	    Log4j.loginfo("Recieved response "+ response.getStatusCode());
	}
	
	@Then("Get Session Id")
	public void get_session_id() throws SAXException, IOException, ParserConfigurationException {
	    // Write code here that turns the phrase above into concrete actions
		@SuppressWarnings("rawtypes")
		ResponseBody resp = response.getBody();
	    sessionId = xmlExtract.Extraction(resp, "out_SessionKey", 0, "");
	    System.out.println(sessionId);
	    Log4j.loginfo("SessionId is created - SessionID : "+ sessionId);
	}
	
	@Given("Validate Card Details Card {string}")
	public void validate_card_details_card(String CardId) throws FileNotFoundException  {
	    // Write code here that turns the phrase above into concrete actions
	    req = given().spec(RequestSpecification()).queryParams("sk", sessionId).body(MemberServiceRequestPayLoad.ValidateCard(CardId));
	    Log4j.loginfo("Card Validation - CardId : "+ CardId);
	    
	}
	
	

}
