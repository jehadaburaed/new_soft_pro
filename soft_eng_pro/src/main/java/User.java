package jehad;

import java.util.*;

public class User {
	jehad.Admin admin = new jehad.Admin();
	String id;
	String name;
	String email;
	String address;
	String postalCode;

	String city;
	String password = "";
	ArrayList<String> addingBorrow= new ArrayList<String>() ;
	ArrayList<ArrayList> borrowedBooks= new ArrayList<ArrayList>() ;
	boolean maxBorrowed = false;
	int borrowedOld;
	ArrayList<ArrayList> users= new ArrayList<ArrayList>(); 
	boolean userSearch = false;
	boolean userSearched = false;
	boolean strSearch = false;
	boolean strSearched = false;
	boolean borrowedSuccessfully = false;
	boolean removed = false;
	String strSearching = " ";
	String userSearching = " ";
	int userSearchedNum = 0;


	public boolean loggedIn() {

		return userSearched;
	}

	public void theLogin(String idV) {
		id = idV;
		usersSearch(id);

	}

	public void logout() {
		id = "";

	}

	public void usersSearch(String strSearch) {
		int searchListLength = users.size();
		userSearched = false;
		userSearchedNum = 0;
		for (int i = 0; i < searchListLength; i++) {
			ArrayList<String> tmp ;
			tmp = users.get(i);
			for (int j = 0; j < 6; j++) {

				if (tmp.get(j).equals(strSearch)) {
					userSearched = true;
					userSearching = tmp.get(0);
					userSearchedNum = i;
				}
			}

			if (userSearched) {
				userFound();
			}
		}
	}

	public boolean isFound() {

		if (strSearched) {
			System.out.println("the book with id " + strSearching + " is found");

		}

		return strSearched;

	}

	public boolean userFound() {

		if (userSearched) {
			System.out.println("the User with id " + userSearching + " is found");

		}

		return userSearched;

	}

	public void addUser(String iD, String name, String email, String address, String postalCode, String city) {
		if (true) {
			ArrayList<String> bookDef = new ArrayList<String>();
			bookDef.add(iD);
			bookDef.add(name);
			bookDef.add(email);
			bookDef.add(address);
			bookDef.add(postalCode);
			bookDef.add(city);

			ArrayList<String> tmp;

			int searchListLength = users.size();

			for (int i = 0; i < searchListLength; i++) {
				tmp = users.get(i);
				for (int j = 0; j < 6; j++) {

					if (tmp.get(j).equals(bookDef.get(j))) {
						userSearch = true;
						System.out.println("This User is already registered");
						return;
					}

				}

			}

			users.add(bookDef);
			userSearch = false;
			System.out.println("Registering a User done successfully");
			
		}

		else
			System.out.println("Admin login is required");

	}

	public void set_max_borrowed(boolean m) {
		maxBorrowed = m;
	}

	public boolean get_max_borrowed() {
		return maxBorrowed;
	}

	public void addBorrow(String book_id, String user_id) {
		borrowedOld = 0;
		if (loggedIn()) {

			int searchListLength = borrowedBooks.size();

			for (int i = 0; i < searchListLength; i++) {
				ArrayList<String> tmp = new ArrayList<String>();
				tmp = borrowedBooks.get(i);
				for (int j = 0; j < 2; j++) {

					if (tmp.get(j).equals(user_id)) {
						borrowedOld++;

					}
				}

			}

			if (borrowedOld == 5) {
				System.out.println("you can't borrow more than five Books");
				maxBorrowed = true;
				

			} else if (borrowedOld < 5) {

				ArrayList<String> addingBorrow = new ArrayList<String>();
				addingBorrow.add(book_id);
				addingBorrow.add(user_id);
				borrowedBooks.add(addingBorrow);
				borrowedSuccessfully = true;
				System.out.println("borrowed successfully");
				
			}
		} else
			System.out.println("User login required");
	}

	public int get_borrowed_old() {
		return borrowedOld;
	}

	public int get_borrowed_size() {
		return borrowedBooks.size();
	}

	public boolean borrowed_successfully() {
		return borrowedSuccessfully;
	}

	public boolean isExist() {

		return strSearch;

	}

	public void returnBook(String book_id, String user_id) {
		removed = false;
		if (loggedIn()) {
			ArrayList<String> check = new ArrayList<String>();
			check.add(book_id);
			check.add(user_id);
			int searchListLength = borrowedBooks.size();

			for (int i = 0; i < searchListLength; i++) {

				if (borrowedBooks.get(i).equals(check)) {
					borrowedBooks.remove(i);
					removed = true;
					System.out.println("removed successfully");
					return;
				}
			}
			System.out.println("this book is not borrowed by you");
			return;
		}
		System.out.println("User login required");
		
	}

	public boolean isRemoved() {

		return removed;

	}

	public void unregister(String user_id) {

		if (true) {
			usersSearch(user_id);
			if (userSearched) {
				users.remove(userSearchedNum);
				System.out.println("The User Is Out Of Library");
			} else
				System.out.println("This User is not registered");

		} else
			System.out.println("Admin login is required");
	}

}
