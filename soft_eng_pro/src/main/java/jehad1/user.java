package jehad1;

import java.util.*;

public class user {
	jehad1.admin_user admin_user  = new jehad1.admin_user();
	String ID;
	String name;
	String email;
	String address;
	String postal_code;
	
	String city;
	String password ="";
	ArrayList<String> adding_borrow = new ArrayList<String>();
	ArrayList<ArrayList> borrowed_books = new ArrayList<ArrayList>();
	boolean max_borrowed = false;
	int borrowed_old;
	ArrayList<ArrayList> users = new ArrayList<ArrayList>();
	ArrayList<String> user_def = new ArrayList<String>();
	boolean user_search = false;
	boolean user_searched = false;
	boolean str_search = false;
	boolean str_searched = false;
	boolean borrowed_successfully = false ;
	boolean removed = false ;
	String str_Searched = " ";
	String user_Searched = " ";

//	public user() {
//		this.ID = null;
//		this.name = null;
//		this.email = null;
//		this.address = null;
//		this.postal_code = null;
//		this.city = null;
//	}
//
//	public user(String ID, String name, String email, String address, String postal_code, String city) {
//		this.ID = ID;
//		this.name = name;
//		this.email = email;
//		this.address = address;
//		this.postal_code = postal_code;
//		this.city = city;
//	}

	public boolean Logged_in() {

		return user_searched;
	}

	

	public void the_Login( String id) {
		ID = id;
		users_search(ID);
		
		
	}

	public void logout() {
		ID = "";
		
	}

	public void users_search(String str_searching) {
		int searchListLength = users.size();

		for (int i = 0; i < searchListLength; i++) {
			ArrayList<String> tmp = new ArrayList<String>();
			tmp = users.get(i);
			for (int j = 0; j < 6; j++) {

				if (tmp.get(j).equals(str_searching)) {
					user_searched = true;
					user_Searched = tmp.get(0);
				}
			}

			if (user_searched) {
				user_Found();
			}
		}
	}

	public boolean is_Found() {

		if (str_searched) {
			System.out.println("the book with ID " + str_Searched + " is found");

		}

		return str_searched;

	}
	
	public boolean user_Found() {

		if (user_searched) {
			System.out.println("the user with ID " + user_Searched + " is found");

		}

		return user_searched;

	}

	public void addUser(String ID, String name, String email, String address, String postal_code,String city)
	{
		if(true) {
		ArrayList<String> user_def = new ArrayList<String>();
		user_def.add(ID);
		user_def.add(name);
		user_def.add(email);
		user_def.add(address);
		user_def.add(postal_code);
		user_def.add(city);

		

		ArrayList<String> tmp;

		int searchListLength = users.size();

		for (int i = 0; i < searchListLength; i++) {
			tmp = users.get(i);
			for (int j = 0; j < 6; j++) {

				if (tmp.get(j).equals(user_def.get(j))) {
					user_search = true;
					System.out.println("This user is already registered");
					return;
				}

			}

		}

		users.add(user_def);
		user_search = false;
		System.out.println("Registering a user done successfully");
		return;
		}
		
		else System.out.println("Admin login is required");

	}

	public void set_max_borrowed(boolean m) {
		max_borrowed = m;
	}

	public boolean get_max_borrowed() {
		return max_borrowed;
	}

	public void add_borrow(String book_id , String user_id) {
		borrowed_old=0;
		if ( Logged_in() ) {
			
			int searchListLength = borrowed_books.size();

			for (int i = 0; i < searchListLength; i++) {
				ArrayList<String> tmp = new ArrayList<String>();
				tmp = borrowed_books.get(i);
				for (int j = 0; j < 2 ; j++) {

					if (tmp.get(j).equals(user_id)) {
						borrowed_old++;
						
						
					}
				}
	
			}
			
		
		if ( borrowed_old == 5 ){
			 System.out.println("you can't borrow more than five books");
			max_borrowed = true;
			return;
			
		}		
		else if(borrowed_old < 5)	{
			
			
			ArrayList<String> adding_borrow = new ArrayList<String>();
			adding_borrow.add(book_id);
			adding_borrow.add(user_id);
			borrowed_books.add(adding_borrow);
			borrowed_successfully = true;
			 System.out.println("borrowed successfully");
			 return;
		}
	}
		else System.out.println("user login required");
	}

	public int get_borrowed_old() {
		return borrowed_old;
	}

	public int get_borrowed_size() {
		return borrowed_books.size();
	}
	public boolean borrowed_successfully() {
		return borrowed_successfully;
	}

	public boolean is_Exist() {

		return str_search;

	}
	
	
	public void return_book(String book_id , String user_id) {
		 removed = false ;
		if (Logged_in())
		{
			ArrayList<String> check = new ArrayList<String>();
			check.add(book_id);
			check.add(user_id);
			int searchListLength = borrowed_books.size();

			for (int i = 0; i < searchListLength; i++) {
				
					if ( borrowed_books.get(i).equals(check) ) {
						borrowed_books.remove(i);
						 removed = true ;
						 System.out.println("removed successfully");
						 return;
					}
				}
			 System.out.println("this book is not borrowed by you");
			 return;
			}
		 System.out.println("user login required");
		 return;
		}
	
	public boolean is_removed() {

		return removed;
	
	}
	
	
	}
	
	

