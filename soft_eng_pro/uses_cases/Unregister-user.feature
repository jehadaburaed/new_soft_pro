Feature:Unregister user

Scenario: Unregister a user
	Given a user is registered with the Elibrary
	And that the admin is logged in
	When the admin try to unregister that user
	Then the user is out of library
	
Scenario: user has borrowed books
	Given a user is registered with the Elibrary
	And the user has borrowed books
	And that the admin is logged in
	When the admin try to unregister that user
	Then the error message "this user has borrowed books" is given
	
Scenario: user has fines 
	Given a user is registered with the Elibrary
	And the user has fines
	And that the admin is logged in
	When the admin try to unregister that user
	Then the error message "this user has fines" is given