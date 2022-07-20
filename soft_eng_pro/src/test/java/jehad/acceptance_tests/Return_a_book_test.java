package jehad.acceptance_tests;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Return_a_book_test {
	jehad1.admin_user admin_user= new jehad1.admin_user(); ;
	jehad1.user user1= new jehad1.user();	
	
	@Given("that the user is logged in")
	public void thatTheUsserIsLoggedIn() {
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
		 user1.users_search("11924313");
		 
	}
	
	@Given("the user is borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		user1.add_borrow("Ali99" , "11924313");
	}
	@When("the user is return the book to the library")
	public void theUserIsReturnTheBookToTheLibrary() {
		user1.return_book("Ali99" , "11924313");
	}
	@Then("returning completed successfully")
	public void returningCompletedSuccessfully() {
		assertTrue( user1.is_removed() );
	}

	@Given("the user is not borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsNotBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		user1.return_book("Kent99" , "11924313");
	}
	@Given("that the user is logged out")
	public void thatTheeUserIsLoggedOut() {
	  user1.logout();
	  user1.return_book("Ali99" , "11924313");
	}
	@Then("Then the error message {string} is given")
	public void thenTheErrorMessageIsGiven(String string) {
	    
	}
	@Then("the error message {string} is given")
	public void theErrorMessageIsGiven(String string) {
	   
	}








}  
