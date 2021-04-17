Feature: Add book 

Scenario Outline: Add a book when the administrator is logged in 
	Given Admin is logged in and want to add book 
	When Admin fill the data  for the book <the title>,<the author>,<the ISBN>,<Signature> and added them
	Then  admin should see the book added in book part 
	Examples: 
		|the title|the author|the ISBN|Signature|
		|"Test-Drivenest Driven Development"|"Kent Beck"|"9780321146533"|"Beck2002"|
		
		
Scenario: Add a book when the administrator is not logged in 
	Given The user on the login page from the site 
	When Admin open The book part 
	Then Error message displayed with you should log in as admin to the site 
	And admin  returns back to the login page 