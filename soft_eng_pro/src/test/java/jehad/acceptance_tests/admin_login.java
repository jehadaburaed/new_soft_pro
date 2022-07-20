package jehad.acceptance_tests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class admin_login {
	jehad1.admin_user admin_user;
	jehad1.books book ;
	public admin_login() {
		
		 admin_user = new jehad1.admin_user();
		book  =new jehad1.books() ;

		
	}
	
	
@Given("that the admin is not logged in")
public void thatTheAdminIsNotLoggedIn() {
	
	 assertEquals( admin_user.Logged_in() , false );
	
}

@Given("the password is {string}")
public void thePasswordIs(String password) {
	
	admin_user.the_Login("adminadmin");
}

@Then("the admin login succeeds")
public void theAdminLoginSucceeds() {
	
	assertEquals( admin_user.Logged_in() , true );
}
@Then("the admin is logged in")
public void theAdminIsLoggedIn() {
	
	assertEquals( admin_user.Logged_in() , true );
}
@Then("the admin login fails")
public void theAdminLoginFails() {
	admin_user.the_Login("adminxyz");
	assertEquals( admin_user.Logged_in() , false );
}

@Then("the admin is not logged in")
public void theAdminIsNotLoggedIn() {
   
	assertEquals( admin_user.Logged_in() , false );
}


}
