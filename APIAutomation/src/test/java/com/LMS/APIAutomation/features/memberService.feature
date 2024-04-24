Feature: Validating Member Service API
@Smoke
Scenario Outline: Verify if the User able to login to application
	Given Add Login Payload UserName "<UserName>" Password "<Password>"
	When user call "login" API with "Post" http request
	Then the API call got success with status 200
	And Get Session Id
	
Examples:
	|UserName|Password |
	|HQL	 | Abcd123 |
#	|HQ 	 | Abcd1234|

@Regression
Scenario Outline: Validating the Card
	Given Validate Card Details Card "<Card>"
	When user call "validateCard" API with "Post" http request
	Then the API call got success with status 200
	
Examples:
		|Card 	   |
		|1000897897|
		
