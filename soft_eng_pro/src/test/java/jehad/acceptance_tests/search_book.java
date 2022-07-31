package jehad.acceptance_tests;
import static org.junit.Assert.*;

import java.util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jehad1.*;

public class search_book {
	
	admin_user admin ;
	books book ;
	ELibrary library;
	
	public search_book() {		
		admin = new admin_user();
		book  = new books() ;
		library = new ELibrary();
	}
	
	
	@Given("these books are contained in the library")
	public void theseBooksAreContainedInTheLibrary(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
	    
	    for (List<String> columns : rows) {
	        library.addBook(new books(columns.get(0), columns.get(1),columns.get(2)));
	    }
	}
	
	
	
	@When("the user searches for the text {string}")
	public void theUserSearchesForTheText(String string) {
		library.searchBook(string);
	}
	@Then("the book with code {string} is found")
	public void theBookWithCodeIsFound(String string) {		
		assertNotEquals(library.searchBook(string).size(), 0);	   
	}
	
	@Then("no books are found")
	public void noBooksAreFound() {
		assertEquals(library.searchBook("Sofa").size(), 0);
	}
	
	@Then("the books with code {string} and {string} are found")
	public void theBooksWithCodeAndAreFound(String string, String string2) {
		
	}

} 
