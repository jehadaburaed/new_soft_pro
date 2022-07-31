package jehad.acceptance_tests;

import io.cucumber.java.en.*;
import jehad1.*;

import static org.junit.Assert.*;
import org.mockserver.*;
import static org.mockito.Mockito.*;

public class Notify_user_test {
	admin_user admin ;
	books book ;
	User user1;
	ELibrary library;
	MockEmailServerHolder emailServerHolder;
	EmailServer emailServer;
	
	public Notify_user_test() {
		
		admin = new admin_user();
		book  =new books() ;
		user1= new User();
		library = new ELibrary();
		emailServerHolder = new MockEmailServerHolder(library);
		emailServer = new EmailServer();
	}
	

	@Given("there is a user with atleast one late book")
	public void thereIsAUserWithAtleastOneLateBook() {
		user1 = new User("11924313", "Jehad Nael", "jeh@gmail.com", "Sebastia street", "A26HW3", "Sebastia");
		user1.login();
		user1.borrowBook(book);
		DateServer dateserver = new DateServer();
//		DateServer dateserver = mock(DateServer.class);
		dateserver = user1.getBookDate(book);
		dateserver.advanceDateByDays(21);
	}
	@When("the admin sends a reminder email")
	public void theAdminSendsAReminderEmail() {
	    emailServerHolder.setMockEmailServer(emailServer);
	    emailServer.sendEmail(user1.getEmail(),"Late book(s)", "You have n late book(s)");
	}
	@Then("then the user should receive an email with subject {string} and body {string}")
	public void thenTheUserShouldReceiveAnEmailWithSubjectAndBody(String string, String string2) throws Exception{
	    verify(emailServerHolder.getMockEmailServer()).sendEmail(user1.getEmail(),string, string2);
	}
}
