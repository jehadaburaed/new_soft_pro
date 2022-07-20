Feature: Register a user to an e-library
	Description:Register the user to the e-library
	Actors: Admin

Scenario: Register a user when the adminstrator is not logged in
	Given that the administrator is not logged in
	And there is a user with  ID "11924313", name "Jehad Nael", email "jeh@gmail.com",address "Sebastia street",postal code "A26HW3", and city "Sebastia"
	When the user is registered to the library
	Then the error message "Admin login is required" is given

Scenario: Register a user successfully
	Given that the administrator is logged in
	And there is a user with  ID "2984754", name "Ahmad Ali", email "ahm@gmail.com",address "Nablus street",postal code "H3H1T5", and city "Nablus" 
	When the user is registered to the library
	Then the user with ID "2984754", name "Ahmad Ali", email "ahm@gmail.com",address "Nablus street",postal code "H3H1T5", and city "Nablus" is registered to the library

	Scenario: Register a user that is already registered
	Given that the administrator is logged in
	And there is a user with  ID "2984754", name "Ahmad Ali", email "ahm@gmail.com",address "Nablus street",postal code "H3H1T5", and city "Nablus" 
	When the user is registered to the library
	Then the error message "This user is already registered" is given
	