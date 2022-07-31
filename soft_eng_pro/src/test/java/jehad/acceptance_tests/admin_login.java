package jehad.acceptance_tests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jehad1.*;

import static org.junit.Assert.*;

public class admin_login {
	admin_user admin;
	books book ;
	public admin_login() {		
		 admin = new admin_user();
		book  =new books() ;		
	}
	
	
@Given("that the admin is not logged in")
public void thatTheAdminIsNotLoggedIn() {	
	 admin.logout();;	
}

@Given("the password is {string}")
public void thePasswordIs(String password) {	
	admin.login(password);
}

@Then("the admin login succeeds")
public void theAdminLoginSucceeds() {
	assertEquals( admin.isLoggedin() , true );
}
@Then("the admin is logged in")
public void theAdminIsLoggedIn() {	
	assertEquals( admin.isLoggedin() , true );
}
@Then("the admin login fails")
public void theAdminLoginFails() {
	assertEquals( admin.isLoggedin() , false );
}

@Then("the admin is not logged in")
public void theAdminIsNotLoggedIn() {   
	assertEquals( admin.isLoggedin() , false );
}


}
