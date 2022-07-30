  package jehad.acceptance_tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import jehad1.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register_a_user_test {
	
	admin_user admin;
	User user1;
	ELibrary library;
	
	public register_a_user_test(){
		admin= new admin_user();
		user1= new User();
		library = new ELibrary();
	}
	
	@Given("that the administrator is not logged in")
	public void thatTheAdministratorrIsNotLoggedIn() {
		admin.logout();
	}
	
	@Given("there is a user with  ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string}")
	public void thereIsAUserWithIDNameEmailAddressPostalCodeAndCity(String string, String string2, String string3, String string4, String string5, String string6) {
		user1 = new User(string,string2, string3, string4, string5, string6);
	}
	
	@When("the user is registered to the library")
	public void TheUserIsRegisteredToTheLibrary() {
		library.registerUser(user1);	
	}
	
	@Then("the user with ID {string}, name {string}, email {string},address {string},postal code {string}, and city {string} is registered to the library")
	public void theUserWithIDNameEmailAddressPostalCodeCityIsRegisteredToTheLibrary(String string, String string2, String string3, String string4, String string5, String string6) {
		assertTrue(library.searchUser(user1));
	}	

} 
