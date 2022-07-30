package jehad.acceptance_tests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class admin_login {
	jehad.Admin admin;
	jehad.Books book ;
	public admin_login() {
		
		 admin = new jehad.Admin();
		book  =new jehad.Books() ;

		
	}
	
	
@Given("that the admin is not logged in")
public void thatTheAdminIsNotLoggedIn() {
	
	 assertEquals( admin.loggedIn() , false );
	
}

@Given("the password is {string}")
public void thePasswordIs(String password) {
	
	admin.theLogin("adminadmin");
}

@Then("the admin login succeeds")
public void theAdminLoginSucceeds() {
	
	assertEquals( admin.loggedIn() , true );
}
@Then("the admin is logged in")
public void theAdminIsLoggedIn() {
	
	assertEquals( admin.loggedIn() , true );
}
@Then("the admin login fails")
public void theAdminLoginFails() {
	admin.theLogin("adminxyz");
	assertEquals( admin.loggedIn() , false );
}

@Then("the admin is not logged in")
public void theAdminIsNotLoggedIn() {
   
	assertEquals( admin.loggedIn() , false );
}


}
