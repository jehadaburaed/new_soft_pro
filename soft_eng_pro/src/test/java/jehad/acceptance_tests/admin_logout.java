package jehad.acceptance_tests;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

public class admin_logout {
	jehad1.admin_user admin_user ;
	public admin_logout() {
		
		 admin_user = new jehad1.admin_user();
		

		
	}
	
	@Given("that the admin is logged in")
	public void thatTheAdminIsLoggedIn() {
		admin_user.the_Login("adminadmin");
		assertEquals( admin_user.Logged_in() , true );
	}
	@When("the admin logs out")
	public void theAdminLogsOut() {
		admin_user.logout();
		assertEquals( admin_user.Logged_in() , false );
	}
	

} 
