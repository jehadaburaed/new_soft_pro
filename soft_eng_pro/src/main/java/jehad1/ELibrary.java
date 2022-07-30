package jehad1;

import java.util.*;

import shaded_package.org.apache.commons.collections.map.HashedMap;

public class ELibrary {
	private HashMap<books,books> Books;
	private HashMap<User,User> Users;
	
	public ELibrary() {
		this.Books = new HashMap<books,books>();
		this.Users = new HashMap<User,User>();
	}
	
	public void addBook(books book) {
		this.Books.put(book, book);
	}
	
	public void registerUser(User user) {
		this.Users.put(user, user);
	}
	
	public void unregisterUser(User user) {
		this.Users.remove(user);
	}
	
	public void removeBook(books book) {
		this.Books.remove(book);
	}
	
	public HashMap<books,books> searchBook(String string) {
		HashMap<books,books> booksFound = new HashMap<books, books>();
		for (Map.Entry<books, books> entry: this.Books.entrySet()){
            books tmp = entry.getKey();
            if(tmp.getSignature().contains(string)) {
            	booksFound.put(tmp, tmp);
            }
            else if(tmp.getAuthor().contains(string)) {
            	booksFound.put(tmp, tmp);
            }
            else if(tmp.getTitle().contains(string)) {
            	booksFound.put(tmp, tmp);
            }
		}
		return booksFound;
	}

	public boolean searchUser(User user1) {
		for (Map.Entry<User, User> entry: this.Users.entrySet()){
            User tmp = entry.getKey();
            if(tmp.getID().contains(user1.getID())) {
            	return true;
            }
		}
		return false;
	}	
}
