package jehad1;

public class admin_user {
	String string = "";
	public boolean Logged_in() {
		if ( string == "adminadmin" )
		return true;
		else return false;
	}

	public void the_Login(String strr) {
		
		 string=strr;
	}

	public void logout() {
		 string="";
		
	}

}
