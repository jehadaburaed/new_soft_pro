package jehad.acceptance_tests;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

public class admin_logout {
	jehad.Admin admin ;
	public admin_logout() {
		
		 admin = new jehad.Admin();
		

		
	}
	
	@Given("that the admin is logged in")
	public void thatTheAdminIsLoggedIn() {
		admin.theLogin("adminadmin");
		assertEquals( admin.loggedIn() , true );
	}
	@When("the admin logs out")
	public void theAdminLogsOut() {
		admin.logout();
		assertEquals( admin.loggedIn() , false );
	}
	

} 
