package jehad.acceptance_tests;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Return_a_book_test {
	jehad.Admin admin= new jehad.Admin(); ;
	jehad.User user1= new jehad.User();	
	
	@Given("that the user is logged in")
	public void thattTheUsserIsLoggedIn() {
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
		 user1.usersSearch("11924313");
		 
	}
	
	@Given("the user is borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		
		user1.addBorrow("Ali99" , "11924313");
	}
	@When("the user is return the book to the library")
	public void theUserIsReturnTheBookToTheLibrary() {
		user1.returnBook("Ali99" , "11924313");
	}
	@Then("returning completed successfully")
	public void returningCompletedSuccessfully() {
		assertTrue( user1.isRemoved() );
	}

	@Given("the user is not borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsNotBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		user1.returnBook("Kent99" , "11924313");
	}
	@Given("that the user is logged out")
	public void thatTheeUserIsLoggedOut() {
	  user1.logout();
	  user1.returnBook("Ali99" , "11924313");
	}
	
	@Then("Then the error message {string} is given")
	public void thenTheErrorMessageIsGiven(String string) {
		user1.usersSearch("11924313");
		user1.addBorrow("Ali99" , "11924313");
	}
	@Then("the error message {string} is given")
	public void theErrorMessageIsGiven(String string) {
	   
	}








}  
