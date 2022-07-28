package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.mockserver.*;

public class Late_book_test {
	jehad1.admin_user admin_user ;
	jehad1.books book ;
	jehad1.user user1;
	public Late_book_test() {
		admin_user = new jehad1.admin_user();
		 book  =new jehad1.books() ;
		 user1= new jehad1.user();
	}

	@Given("the user has borrowed a book")
	public void theUserHasBorrowedABook() {
	    user1.add_borrow(null, null);
	}
	@Given("the fine for one late book is {int} NIS")
	public void theFineForOneLateBookIsNIS(Integer int1) {
		
	}
	@Then("the user has Late books")
	public void theUserHasLateBooks() {
	    
	}



}
