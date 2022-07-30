package jehad.acceptance_tests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class Notify_user_test {
	jehad.Admin admin ;
	jehad.Books book ;
	jehad.User user1;
	
	public Notify_user_test() {
		
		admin = new jehad.Admin();
		book = new jehad.Books();
		user1= new jehad.User();
		
	}
	
	
	 @Given("there is a user with atleast one late book")
	 public void thereIsAUserWithAtleastOneLateBook() {
	     // Write code here that turns the phrase above into concrete actions
	    
	 }
	 @When("the admin sends a reminder email")
	 public void theAdminSendsAReminderEmail() {
	     // Write code here that turns the phrase above into concrete actions
	   
	 }
	 @Then("then the user should receive an email with subject {string} and body {string}")
	 public void thenTheUserShouldReceiveAnEmailWithSubjectAndBody(String string , String string2) {
	     // Write code here that turns the phrase above into concrete actions
	    
	 }
	
	
	

}
