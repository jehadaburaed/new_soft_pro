package jehad.acceptance_tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Late_book_test {
	
	
	
	@Given("the user has borrowed a book")
	public void theUserHasBorrowedABook() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@Given("the fine for one late book is {int} NIS")
	public void theFineForOneLateBookIsNIS(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("the user has Late books")
	public void theUserHasLateBooks() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

}
