package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.mockserver.*;

public class Notify_user_test {
	jehad1.admin_user admin_user ;
	jehad1.books book ;
	jehad1.user user1;
	
	public Notify_user_test() {
		
		admin_user = new jehad1.admin_user();
		 book  =new jehad1.books() ;
		 user1= new jehad1.user();
		
	}
	

	@Given("there is a user with atleast one late book")
	public void thereIsAUserWithAtleastOneLateBook() {
		
	}
	@When("the admin sends a reminder email")
	public void theAdminSendsAReminderEmail() {
	    
	}
	@Then("then the user should receive an email with subject {string} and body {string}")
	public void thenTheUserShouldReceiveAnEmailWithSubjectAndBody(String string, String string2) {
	    
	}



	
	
	
	

}
