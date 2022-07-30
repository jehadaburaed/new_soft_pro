package jehad;

public class Admin {
	String adminPass = "";

	public boolean loggedIn() {
	
			return adminPass.equals("adminadmin");
		
			
	}

	public void theLogin(String strr) {

		adminPass = strr;
	}

	public void logout() {
		adminPass = "";

	}

}
