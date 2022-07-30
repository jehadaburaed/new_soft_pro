package jehad.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.When;


public class Unregister_user_test {
	jehad.Admin admin ;
	jehad.Books book ;
	jehad.User user1;
	public Unregister_user_test() {
		 admin = new jehad.Admin();
		 book  =new jehad.Books() ;
		 user1= new jehad.User();
		
	}
	
	
	
	@Given("a user is registered with the Elibrary")
	public void aUserIsRegisteredWithTheElibrary() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("the admin try to unregister that user")
	public void theAdminTryToUnregisterThatUser() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("the user is out of library")
	public void theUserIsOutOfLibrary() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	
	
	
	
	
	

}
