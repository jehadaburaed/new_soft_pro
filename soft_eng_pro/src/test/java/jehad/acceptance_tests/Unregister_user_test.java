package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import jehad1.*;

import static org.junit.Assert.*;
import org.mockserver.*;

public class Unregister_user_test {
	admin_user admin ;
	books book ;
	User user1;
	ELibrary library;
	public Unregister_user_test() {
		 admin = new admin_user();
		 book  =new books() ;
		 user1= new User();
		 library = new ELibrary();
	}	

	@Given("a user is registered with the Elibrary")
	public void aUserIsRegisteredWithTheElibrary() {
		user1 = new User("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");
	    library.registerUser(user1);
	}

	@Given("the user has borrowed books")
	public void theUserHasBorrowedBooks() {
	    book = new books();
		user1.borrowBook(book);
	}

	@Given("the user has fines")
	public void theUserHasFines() {
		user1.login();
		user1.borrowBook(book);
		DateServer dateserver = new DateServer();
//		DateServer dateserver = mock(DateServer.class);
		dateserver = user1.getBookDate(book);
		dateserver.advanceDateByDays(21);
	}




	@When("the admin try to unregister that user")
	public void theAdminTryToUnregisterThatUser() {
	    library.unregisterUser(user1);
	}
	@Then("the user is out of library")
	public void theUserIsOutOfLibrary() {
	    assertFalse(library.searchUser(user1));
	}

}
