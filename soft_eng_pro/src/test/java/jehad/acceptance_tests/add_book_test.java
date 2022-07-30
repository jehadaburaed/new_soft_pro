package jehad.acceptance_tests;

import static org.junit.Assert.*;

import java.util.*;
import java.util.Map;

import jehad1.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class add_book_test {
	
	admin_user admin;
	books book ;
	ELibrary library;
	public add_book_test() {		
		admin = new admin_user();
		book  =new books() ;
		library = new ELibrary();
	}
	
	
	
	@Given("that the administrator is logged in")
	public void thatTheAdministratorIsLoggedIn() {		
		admin.login("adminadmin");		
	}
	
	@Given("there is a book with title {string}, author {string}, and signature {string}")
	public void thereIsABookWithTitleAuthorAndSignature(String string, String string2, String string3) {
		book  = new books(string, string2, string3);
	}
	
	@When("the book is added to the library")
	public void theBookIsAddedToTheLibrary() {
		library.addBook(book);
	}
	@Then("the book with title {string}, author {string}, and signature {string} is contained in the library")
	public void theBookWithTitleAuthorAndSignatureIsContainedInTheLibrary(String string, String string2, String string3) {
		HashMap<books, books> tmp = new HashMap<books, books>();
		tmp.put(book, book);
		assertEquals(library.searchBook(string3),tmp);
	}
	
} 
