package jehad.acceptance_tests;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jehad1.*;

public class Return_a_book_test {
	admin_user admin;
	User user1;
	books book;
	
	public Return_a_book_test() {
		admin= new admin_user(); ;
		user1= new User();
		book = new books();
	}
	
	@Given("that the user is logged in")
	public void thatTheUserIsLoggedIn() {
		user1.login();		 
	}
	
	@Given("the user is borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		book = new books(string, string2, string3);
		user1.borrowBook(book);
	}
	@When("the user is return the book to the library")
	public void theUserIsReturnTheBookToTheLibrary() {
		user1.returnBook(book);
	}
	@Then("returning completed successfully")
	public void returningCompletedSuccessfully() {
		assertFalse(user1.getBorrowedBooks().containsKey(book));
	}

	@Given("the user is not borrowed the book with title {string}, author {string}, and signature {string}")
	public void theUserIsNotBorrowedTheBookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		
	}
	@Given("that the user is logged out")
	public void thatTheUserIsLoggedOut() {
	  user1.logout();
	}
}  
