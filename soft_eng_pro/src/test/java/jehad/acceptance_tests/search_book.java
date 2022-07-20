package jehad.acceptance_tests;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_book {
	
	jehad1.admin_user admin_user ;
	jehad1.books book ;
	public search_book() {
		
		 admin_user = new jehad1.admin_user();
		book  =new jehad1.books() ;

		
	}
	
	
	@Given("these books are contained in the library")
	public void theseBooksAreContainedInTheLibrary(io.cucumber.datatable.DataTable dataTable) {
		admin_user.the_Login("adminadmin");
		book.adding_book( "XP Programming Book",  "Kent Beck", "Kent99");
		 book.adding_book( "C++ Development",  "Alu and Sami", "Alu07");
		 book.adding_book( "Cucumber Java",  "Seb Rose", "Rose54");
		 book.adding_book( "programming C++",  "Deitel", "Deitel4");
			admin_user.logout();

	   
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
		
		assertEquals( book.is_Found() , true );
	   
	}
	
	@Then("no books are found")
	public void noBooksAreFound() {
		book  = new jehad1.books() ;
		book.search("Sofa");
		
		assertEquals( book.is_Found() , false );
	}
	
	@Then("the books with code {string} and {string} are found")
	public void theBooksWithCodeAndAreFound(String string, String string2) {
		book  = new jehad1.books() ;
		book.adding_book( "programming C++",  "Deitel", "Deitel4");
		 book.adding_book( "C++ Development",  "Alu and Sami", "Alu07");
		 book.search("C++");
		assertEquals( book.is_Found() , true );
	}

} 
