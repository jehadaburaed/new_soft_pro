Feature: Returning the books to the library based on code
	Description: A user or admin Returning the books by the code
	Actors: user

Scenario: Return a book successfully
	Given that the user is logged in
	And the user is borrowed the book with title "Head First Java", author "Ali Ahmad", and signature "Ali99"
	When the user is return the book to the library
	Then returning completed successfully

Scenario: returning a book not borrowed 
	Given that the user is logged in
	And the user is not borrowed the book with title "Head First Java", author "Ali Ahmad", and signature "Ali99"
	When the user is return the book to the library
	Then Then the error message "this book is not borrowed by you" is given 

Scenario: returning  when the user logged out 
	Given that the user is logged out 
	When the user is return the book to the library
	Then the error message "user login required" is given

