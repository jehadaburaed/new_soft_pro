package jehad.acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Borrow_a_book_test {
	jehad1.user user1;
	jehad1.books book;

	public Borrow_a_book_test() {
		
		user1 = new jehad1.user();
		book = new jehad1.books();
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	

	}
	

	@Given(" the user is logged in")
	public void thatTheUserIsLoggedInn() {
		user1.the_Login("adminadmin");
	}

	@Given("the user has borrowed less than the maximum")
	public void theUserHasBorrowedLessThanTheMaximum() {
		user1.set_max_borrowed(false);
	}
	
	@Given("theree is a book with title {string}, author {string}, and signature {string}")
	public void thereeIsABookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		user1.add_borrow("Ali99" , "11924313");
	}

	@Given("the user has borrowed the maximum number of books")
	public void theUserHasBorrowedTheMaximumNumberOfBooks() {
		user1.set_max_borrowed(true);		
	}
	

	@Given(" thee user is logged out")
	public void thatTheeUserIsLoggedOut() {
		user1.logout();		
	}


	@When("the user has borrow a book from the library")
	public void theUserIsBorrowABookFromTheLibrary() {
		user1.users_search("11924313");
		user1.add_borrow("Ali99" , "11924313");
	}

	@Then("Borrowing completed successfully")
	public void borrowingCompletedSuccessfully() {
		assertEquals(user1.borrowed_successfully() , true );		
	}
	
	
	@Then("the erroor message {string} is given")
	public void theErrorrMessageeIsGiven(String string) {
	    System.out.println(string);
	}
	
	@Given("a book with code {string} is in the library")
	public void aBookWithCodeIsInTheLibrary(String string) {
	    book.adding_book(string,string,string);	   
	}
	@Given("a user is registered with the library")
	public void aUserIsRegisteredWithTheLibrary() {
	    user1.is_Exist();
	 
	}
	@When("the user borrows the book with code {string}")
	public void theUserBorrowsTheBookWithCode(String string) {
		user1.users_search("11924313");
	    user1.add_borrow(string, "11924313");
	   
	}
	@When("{int} days have passed")
	public void daysHavePassed(Integer int1) {
	    user1.update_days(int1);	  
	}
	@Then("the book with code {string} is not borrowed by the user")
	public void theBookWithCodeIsNotBorrowedByTheUser(String string) {
		book.search(string);
	    assertTrue(book.is_Found());
	}
	
	@Then("the user has to pay a fine of {int} NIS")
	public void theUserHasToPayAFineOfNIS(Integer int1) {
		user1.pay_fine(int1);
		assertTrue(user1.fine_paid());		
	}
	@When("the user returns the book with code {string}")
	public void theUserReturnsTheBookWithCode(String string) {
		user1.return_book(string, "11924313");	  
	}
}   
