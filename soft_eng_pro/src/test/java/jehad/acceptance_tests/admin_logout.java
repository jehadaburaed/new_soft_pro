package jehad.acceptance_tests;

import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jehad1.*;

public class admin_logout {
	admin_user admin ;
	public admin_logout() {		
		 admin = new admin_user();	
	}
	
	@Given("that the admin is logged in")
	public void thatTheAdminIsLoggedIn() {
		admin.login("adminadmin");
		assertEquals( admin.isLoggedin() , true );
	}
	@When("the admin logs out")
	public void theAdminLogsOut() {
		admin.logout();
		assertEquals( admin.isLoggedout() , true );
	}
} 
