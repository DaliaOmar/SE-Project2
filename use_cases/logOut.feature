Feature: Admin logout 
Background: User is Logged In 
	Given User is Logged In 
	
	
Scenario: Administrator logs out 
	When user have chosen logs out 
	Then Message displayed Logout successfully 
	And user  returns back to the login page 