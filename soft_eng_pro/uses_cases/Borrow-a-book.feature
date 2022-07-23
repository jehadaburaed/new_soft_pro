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

Scenario: User cannot borrow books if he has late books
	Given a book with code "xyz" is in the library
	And a book with code "Beck99" is in the library
	And a user is registered with the library
	When the user borrows the book with code "Beck99"
	And 21 days have passed
	And the user borrows the book with code "xyz"
	Then the book with code "xyz" is not borrowed by the user
	And the error message "You can't borrow any new book because you have an overdue books" is given
	
Scenario: User cannot borrow books if he has fines
	Given a book with code "Beck99" is in the library
	And a book with code "xyz" is in the library
	And a user is registered with the library
	When the user borrows the book with code "Beck99"
	And 21 days have passed
	Then the user has to pay a fine of 30 NIS
	When the user returns the book with code "Beck99"
	Then the user has to pay a fine of 30 NIS
	When the user borrows the book with code "xyz"
	Then the book with code "xyz" is not borrowed by the user
	And the error message "Can't borrow book, you have fines" is given
