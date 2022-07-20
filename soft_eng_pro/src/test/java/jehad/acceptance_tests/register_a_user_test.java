  package jehad.acceptance_tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register_a_user_test {
	
	jehad1.admin_user admin_user= new jehad1.admin_user(); ;
	jehad1.user user1= new jehad1.user();	
	
	public register_a_user_test(){
		
	}
	
	@Given(" the administrator is loggeed in")
	public void thatTheeAdministratorrIsLoggedIn() {
		admin_user.the_Login("adminadmin");
	}
	@When("the user is registered to the library")
	public void TheUserIsRegisteredToTheLibrary() {
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
	}
	
	@Then("the user with ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string} is registered to the library")
	public void theUserWithIDNameEmailAddressPostalCodeCityIsRegisteredToTheLibrary(String string, String string2, String string3, String string4, String string5, String string6) {
		
		 user1.users_search("11924313");
		assertTrue( user1.user_Found() );
		
	}
	@Given("that the administrator is not logged in")
	public void thatTheAdministratorrIsNotLoggedIn() {
	admin_user.logout();
	}
	@Given("there is a user with  ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string}")
	public void thereIsAUserWithIDNameEmailAddressPostalCodeAndCity(String string, String string2, String string3, String string4, String string5, String string6) {
		
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
	}
	
	@Then(" errror message {string} is given")
	public void theErrorMassageIsGivenn(String string) {
		
		admin_user.logout();
		user1.addUser("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");	
		
	}


	

} 
