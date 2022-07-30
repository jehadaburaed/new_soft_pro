  package jehad.acceptance_tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register_a_user_test {
	
	jehad.Admin admin= new jehad.Admin(); ;
	jehad.User user1= new jehad.User();	
	
	public register_a_user_test(){
		
	}
	
	@Given(" the administrator is loggeed in")
	public void thatTheeAdministratorrIsLoggedIn() {
		admin.theLogin("adminadmin");
	}
	@When("the user is registered to the library")
	public void TheUserIsRegisteredToTheLibrary() {
		
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
	}
	
	@Then("the user with ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string} is registered to the library")
	public void theUserWithIDNameEmailAddressPostalCodeCityIsRegisteredToTheLibrary(String string, String string2, String string3, String string4, String string5, String string6) {
		
		 user1.usersSearch("11924313");
		assertTrue( user1.userFound() );
		
	}
	@Given("that the administrator is not logged in")
	public void thatTheAdministratorrIsNotLoggedIn() {
	admin.logout();
	}
	@Given("there is a user with  ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string}")
	public void thereIsAUserWithIDNameEmailAddressPostalCodeAndCity(String string, String string2, String string3, String string4, String string5, String string6) {
		
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
	}
	
	@Then(" errror message {string} is given")
	public void theErrorMassageIsGivenn(String string) {
		
		admin.logout();
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
		
	}


	

} 
