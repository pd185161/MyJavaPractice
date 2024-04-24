/**
 * 
 */
package com.LMS.APIAutomation.testCasesRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author sa185402
 *
 */
@RunWith(Cucumber.class)
//tags = "@Smoke",
///memberService.feature
@CucumberOptions(
		features = "src/test/java/com/LMS/APIAutomation/features/TestPK.feature", 
		glue = "com/LMS/APIAutomation/stepDefinitions",  
		plugin = { "pretty",  "html:target/report.html" , 
				"json:target/JsonReports/report.json",
				"junit:target/JunitReports/report.xml"}, 
		monochrome = true,
		dryRun = false,
		tags= "@Regression"
		)
public class TestCaseRunner {

}
