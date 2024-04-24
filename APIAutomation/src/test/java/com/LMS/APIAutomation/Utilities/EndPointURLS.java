/**
 * 
 */
package com.LMS.APIAutomation.Utilities;

/**
 * @author sa185402
 *
 */
public enum EndPointURLS {

	Total("/json/execution/v2/promotions"),
	Finalize("/json/execution/v2/finalize");
	
	
	public String resources;
	
	EndPointURLS(String resources) {
		// TODO Auto-generated constructor stub
		this.resources = resources;
	}
	
	public String getResources() {
		return resources;
	}
	
}
