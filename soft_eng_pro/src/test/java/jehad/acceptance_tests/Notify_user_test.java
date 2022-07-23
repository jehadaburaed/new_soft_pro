package jehad.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Notify_user_test {
	jehad1.admin_user admin_user ;
	jehad1.books book ;
	jehad1.user user1;
	
	public Notify_user_test() {
		
		admin_user = new jehad1.admin_user();
		 book  =new jehad1.books() ;
		 user1= new jehad1.user();
		
	}
	
	
	
	
	
	

}
