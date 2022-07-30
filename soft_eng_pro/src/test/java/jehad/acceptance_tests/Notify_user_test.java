package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import jehad1.*;

import static org.junit.Assert.*;
import org.mockserver.*;

public class Notify_user_test {
	admin_user admin ;
	books book ;
	User user1;
	
	public Notify_user_test() {
		
		admin = new admin_user();
		 book  =new books() ;
		 user1= new User();
		
	}
	

	@Given("there is a user with atleast one late book")
	public void thereIsAUserWithAtleastOneLateBook() {
		user1 = new User("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");
		user1.borrowBook(book);
	}
	@When("the admin sends a reminder email")
	public void theAdminSendsAReminderEmail() {
	    
	}
	@Then("then the user should receive an email with subject {string} and body {string}")
	public void thenTheUserShouldReceiveAnEmailWithSubjectAndBody(String string, String string2) {
	    
	}
}
