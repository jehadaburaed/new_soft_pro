package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.mockserver.*;

public class Unregister_user_test {
	jehad1.admin_user admin_user ;
	jehad1.books book ;
	jehad1.user user1;
	public Unregister_user_test() {
		 admin_user = new jehad1.admin_user();
		 book  =new jehad1.books() ;
		 user1= new jehad1.user();
		
	}	

	@Given("a user is registered with the Elibrary")
	public void aUserIsRegisteredWithTheElibrary() {
	    
	}
	@When("the admin try to unregister that user")
	public void theAdminTryToUnregisterThatUser() {
	    
	}
	@Then("the user is out of library")
	public void theUserIsOutOfLibrary() {
	    
	}

}
