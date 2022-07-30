package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import jehad1.*;

import static org.junit.Assert.*;
import org.mockserver.*;

public class Unregister_user_test {
	admin_user admin ;
	books book ;
	User user1;
	public Unregister_user_test() {
		 admin = new admin_user();
		 book  =new books() ;
		 user1= new User();
		
	}	

	@Given("a user is registered with the Elibrary")
	public void aUserIsRegisteredWithTheElibrary() {
	    
	}

	@Given("the user has borrowed books")
	public void theUserHasBorrowedBooks() {
	    
	}

	@Given("the user has fines")
	public void theUserHasFines() {
	    
	}




	@When("the admin try to unregister that user")
	public void theAdminTryToUnregisterThatUser() {
	    
	}
	@Then("the user is out of library")
	public void theUserIsOutOfLibrary() {
	    
	}

}
