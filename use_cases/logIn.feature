Feature: Admin login 
Scenario Outline: Administrator can log in with valid credentials 
	Given The user on the login page from the site 
	When user login with data <userName> <password> 
	Then message displayed  Login Successfully 
	Examples: 
		| userName   | password |
		| "Dalia"| "dr123"   |
		
		
Scenario Outline: Administrator has the wrong password 
	Given The user on the login page 
	When user  login with informations by using data as <userName> <password> and error password  
	Then Error message displayed with wrong password  
	Examples: 
		| userName   | password |
		| "Dalia" | "dr12"   |