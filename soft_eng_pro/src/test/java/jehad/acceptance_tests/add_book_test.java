package jehad.acceptance_tests;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class add_book_test {
	
	jehad1.admin_user admin_user;
	jehad1.books book ;
	public add_book_test() {
		
		 admin_user = new jehad1.admin_user();
		book  =new jehad1.books() ;

		
	}
	
	
	
	@Given("that the administrator is logged in")
	public void thatTheAdministratorIsLoggedIn() {
		
		admin_user.the_Login("adminadmin");

		
	}
	
	@Given("there is a book with title {string}, author {string}, and signature {string}")
	public void thereIsABookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		book  = new jehad1.books() ;
		 book.adding_book( "Head First Java",  "Ali Ahmad",  "Ali99");
		
		
	}
	
	@When("the book is added to the library")
	public void theBookIsAddedToTheLibrary() {
		book.is_Exist();
	   
	}
	@Then("the book with title {string}, author {string}, and signature {string} is contained in the library")
	public void theBookWithTitleAuthorAndSignatureIsContainedInTheLibrary(String string, String string2, String string3) {
		book  = new jehad1.books() ;
		 book.adding_book( "Head First Java",  "Ali Ahmad",  "Ali99");
		assertEquals(book.is_Exist() , false );
		 book.search("Ali99");
		assertEquals( book.is_Found() , true );
	}
	@Given("that the administraator is not logged in")
	public void thatTheAdministratoorIsNotLoggedIn() {
		admin_user.logout();
	}
	@Then("the error messsage {string} is given")
	public void theErrorMessaggeIsGiven(String string) {
	    System.out.println("Administrator login required");
	}
} 
