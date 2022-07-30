package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import jehad1.*;

import static org.junit.Assert.*;
import org.mockserver.*;

public class Late_book_test {
	admin_user admin ;
	books book ;
	User user1;
	public Late_book_test() {
		admin = new admin_user();
		 book  =new books() ;
		 user1= new User("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");
	}

	@Given("the user has borrowed a book")
	public void theUserHasBorrowedABook() {
		book = new books("", "", "some book code");
	    user1.borrowBook(book);
	}
	@Given("the fine for one late book is {int} NIS")
	public void theFineForOneLateBookIsNIS(Integer int1) {
		
	}
	@Then("the user has Late books")
	public void theUserHasLateBooks() {
	    assertEquals(user1.getFinedBooks().size(), 0);
	}



}
