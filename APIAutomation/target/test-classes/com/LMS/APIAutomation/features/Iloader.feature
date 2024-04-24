Feature: Iloader

Scenario Outline: Import Store
	Given Create Iloader Batch File
	Then Update Store XML Files with new Store "<StoreId>" data
	Then Copy XML Files from Source Path to Destination Path
	When Execute Iloader Batch File
#	Then Validate the Store in DataBase 

Examples:

	|StoreId|
	|88453	|
