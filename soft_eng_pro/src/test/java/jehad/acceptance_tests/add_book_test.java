package jehad.acceptance_tests;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class add_book_test {
	
	jehad.Admin admin;
	jehad.Books book ;
	public add_book_test() {
		
		 admin = new jehad.Admin();
		book  =new jehad.Books() ;

		
	}
	
	
	
	@Given("that the administrator is logged in")
	public void thatTheAdministratorIsLoggedIn() {
		
		admin.theLogin("adminadmin");

		
	}
	
	@Given("there is a book with title {string}, author {string}, and signature {string}")
	public void thereIsABookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		book  = new jehad.Books() ;
		 book.addingBook( "Head First Java",  "Ali Ahmad",  "Ali99");
		
		
	}
	
	@When("the book is added to the library")
	public void theBookIsAddedToTheLibrary() {
		book.isExist();
	   
	}
	@Then("the book with title {string}, author {string}, and signature {string} is contained in the library")
	public void theBookWithTitleAuthorAndSignatureIsContainedInTheLibrary(String string, String string2, String string3) {
		book  = new jehad.Books() ;
		 book.addingBook( "Head First Java",  "Ali Ahmad",  "Ali99");
		assertEquals(book.isExist() , false );
		 book.search("Ali99");
		assertEquals( book.isFound() , true );
	}
	@Given("that the administraator is not logged in")
	public void thatTheAdministratoorIsNotLoggedIn() {
		admin.logout();
	}
	@Then("the error messsage {string} is given")
	public void theErrorMessaggeIsGiven(String string) {
	    System.out.println("Administrator login required");
	}
} 
