package jehad.acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Borrow_a_book_test {
	jehad.User user1;
	jehad.Books book;

	public Borrow_a_book_test() {
		
		user1 = new jehad.User();
		book = new jehad.Books();
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	

	}
	

	@Given("the user is logged in")
	public void thatTheUserIsLoggedIn() {
		user1.theLogin("adminadmin");
	}

	@Given("the user has borrowed less than the maximum")
	public void theUserHasBorrowedLessThanTheMaximum() {
		user1.theLogin("adminadmin");
		user1.set_max_borrowed(false);
	}
	
	@Given("theree is a book with title {string}, author {string}, and signature {string}")
	public void thereeIsABookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		user1.addBorrow("Ali99" , "11924313");
	}

	@Given("the user has borrowed the maximum number of books")
	public void theUserHasBorrowedTheMaximumNumberOfBooks() {
		user1.set_max_borrowed(true);		
	}
	

	@Given("the user is logged out")
	public void thatTheUserIsLoggedOut() {
		user1.logout();		
	}


	@When("the user has borrow a book from the library")
	public void theUserIsBorrowABookFromTheLibrary() {
		user1.usersSearch("11924313");
		user1.addBorrow("Ali99" , "11924313");
	}

	@Then("Borrowing completed successfully")
	public void borrowingCompletedSuccessfully() {
		assertEquals(user1.borrowed_successfully() , true );
		
	}
	
	
	@Then("the erroor message {string} is given")
	public void theErrorrMessageeIsGiven(String string) {
	    
	}
	
	@Given("a book with code {string} is in the library")
	public void aBookWithCodeIsInTheLibrary(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Given("a user is registered with the library")
	public void aUserIsRegisteredWithTheLibrary() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@When("the user borrows the book with code {string}")
	public void theUserBorrowsTheBookWithCode(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("{int} days have passed")
	public void daysHavePassed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("the book with code {string} is not borrowed by the user")
	public void theBookWithCodeIsNotBorrowedByTheUser(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Then("the user has to pay a fine of {int} NIS")
	public void theUserHasToPayAFineOfNIS(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@When("the user returns the book with code {string}")
	public void theUserReturnsTheBookWithCode(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	

}   
