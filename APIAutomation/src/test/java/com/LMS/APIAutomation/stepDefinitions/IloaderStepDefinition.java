/**
 * 
 */
package com.LMS.APIAutomation.stepDefinitions;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import com.LMS.APIAutomation.GenericMethods;
import com.LMS.APIAutomation.Utilities.XMLExtraction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author sa185402
 *
 */
public class IloaderStepDefinition {
	
	GenericMethods genericMetthods = new GenericMethods();
	XMLExtraction xml = new XMLExtraction();
	
	@Given("Create Iloader Batch File")
	public void create_iloader_batch_file() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		genericMetthods.createBATFile("Iloader.bat");    
	}
	
	@Then("Update Store XML Files with new Store {string} data")
	public void update_store_xml_files_with_new_store_data(String StoreId) throws ParserConfigurationException, SAXException, IOException, TransformerException {
	    // Write code here that turns the phrase above into concrete actions
		xml.updateXMLFile("Import-01-2021-12-21T144204-GT.xml","Store", "StoreId", StoreId);
	}
	
	@When("Execute Iloader Batch File")
	public void execute_b_iloader_batch_file() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		genericMetthods.ExecuteBatFile("Iloader.bat");
	}
	
//	@Then("Validate the Store in DataBase")
//	public void validate_the_store_in_data_base() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	
	@Then("Copy XML Files from Source Path to Destination Path")
	public void copy_xml_files_from_source_path_to_destination_path() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		genericMetthods.fileTransfer("Import-01-2021-12-21T144204-GT.xml");
	}
	
}
