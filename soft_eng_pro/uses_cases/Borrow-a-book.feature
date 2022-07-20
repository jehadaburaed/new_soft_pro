Feature: Borrowing the books from the library based on the code
	Description: A user or admin Borrowing the books by the code
	Actors: user

Scenario: Borrow a book successfully
	Given that the user is logged in
	And there is a book with title "Head First Java", author "Ali Ahmad", and signature "Ali99"
	And the user has borrowed less than the maximum
	When the user has borrow a book from the library
	Then Borrowing completed successfully

Scenario: Borrowing more than five books 
	Given that the user is logged in
	And there is a book with title "Head First Java", author "Ali Ahmad", and signature "Ali99"
	And the user has borrowed the maximum number of books
	When the user has borrow a book from the library
	Then the error message "you can't borrow more than five books" is given

Scenario: Borrowing when the user logged out 
	Given that the user is logged out 
	When the user has borrow a book from the library
	Then the error message "user login required" is given

