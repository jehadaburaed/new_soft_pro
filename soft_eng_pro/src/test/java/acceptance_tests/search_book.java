package jehad.acceptance_tests;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_book {
	
	jehad.Admin admin ;
	jehad.Books book ;
	public search_book() {
		
		 admin = new jehad.Admin();
		book  =new jehad.Books() ;

		
	}
	
	
	@Given("these books are contained in the library")
	public void theseBooksAreContainedInTheLibrary(io.cucumber.datatable.DataTable dataTable) {
		
		admin.theLogin("adminadmin");
		
		 book.addingBook( "XP Programming Book",  "Kent Beck", "Kent99");
		 book.addingBook( "C++ Development",  "Alu and Sami", "Alu07");
		 book.addingBook( "Cucumber Java",  "Seb Rose", "Rose54");
		 book.addingBook( "programming C++",  "Deitel", "Deitel4");
		 
		 admin.logout();

	   
	}
	
	
	
	@When("the user searches for the text {string}")
	public void theUserSearchesForTheText(String string) {
		book.search("99");
		book.search("XP");
		book.search("Seb");
		book.search("Alu");

		
	   
	}
	@Then("the book with code {string} is found")
	public void theBookWithCodeIsFound(String string) {
		
		assertEquals( book.isFound() , true );
	   
	}
	
	@Then("no books are found")
	public void noBooksAreFound() {
		book  = new jehad.Books() ;
		book.search("Sofa");
		
		assertEquals( book.isFound() , false );
	}
	
	@Then("the books with code {string} and {string} are found")
	public void theBooksWithCodeAndAreFound(String string, String string2) {
		book  = new jehad.Books() ;
		book.addingBook( "programming C++",  "Deitel", "Deitel4");
		 book.addingBook( "C++ Development",  "Alu and Sami", "Alu07");
		 book.search("C++");
		assertEquals( book.isFound() , true );
	}

} 
