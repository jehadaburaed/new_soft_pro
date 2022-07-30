package jehad.acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import jehad1.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.mockito.Mockito.*;

public class Borrow_a_book_test {
	User user1;
	books book;
	books book2;
	ELibrary library;

	public Borrow_a_book_test() {		
		user1 = new User();
		book = new books();
		book2 = new books();
		library = new ELibrary();
	}

	@Given("the user has borrowed less than the maximum")
	public void theUserHasBorrowedLessThanTheMaximum() {
		
	}

	@Given("the user has borrowed the maximum number of books")
	public void theUserHasBorrowedTheMaximumNumberOfBooks() {
		
	}

	@When("the user has borrow a book from the library")
	public void theUserIsBorrowABookFromTheLibrary() {
		user1.borrowBook(book);
	}

	@Then("Borrowing completed successfully")
	public void borrowingCompletedSuccessfully() {
		
	}
	
	
	@Then("the error message {string} is given")
	public void theErrorMessageIsGiven(String string) {
	    System.out.println(string);
	}
	
	@Given("a book with code {string} is in the library")
	public void aBookWithCodeIsInTheLibrary(String string) {
        book = new books("", "", string);
        library.addBook(book);
	}
	@Given("a user is registered with the library")
	public void aUserIsRegisteredWithTheLibrary() {
	    user1 = new User("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");
	    library.registerUser(user1);	 
	}
	@When("the user borrows the book with code {string}")
	public void theUserBorrowsTheBookWithCode(String string) {
		book = new books("", "", string);
		user1.borrowBook(book);	   
	}
	@When("{int} days have passed")
	public void daysHavePassed(Integer int1) throws Exception{
		user1.login();
		user1.borrowBook(book);
		DateServer dateserver = mock(DateServer.class);
		dateserver = user1.getBookDate(book);
		dateserver.advanceDateByDays(int1);
	}
	@Then("the book with code {string} is not borrowed by the user")
	public void theBookWithCodeIsNotBorrowedByTheUser(String string) {
		book = new books("", "", string);
		assertFalse(user1.getBorrowedBooks().containsKey(book));
	}
	
	@Then("the user has to pay a fine of {int} NIS")
	public void theUserHasToPayAFineOfNIS(Integer int1) {
			
	}
	@When("the user returns the book with code {string}")
	public void theUserReturnsTheBookWithCode(String string) {
		user1.returnBook(book);	  
	}
}   
