package jehad1;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User {
    private static final int MAXBOOKS = 5;
    private static final int BORROWLIMIT = 21;
    private static final int FINEAMOUNT = 30;
    private String ID;
    private String name;
    private String email;
    private String address;
    private String postalCode;
    private String city;
    private boolean logged = false;
    private int fine = 0;
    private HashMap<books, DateServer> borrowedBooks = new HashMap<books, DateServer>();
    private HashMap<books, Boolean> finedBooks = new HashMap<books, Boolean>();
    
    public User() {
        this.ID = null;
        this.name = null;
        this.email = null;
        this.address = null;
        this.postalCode = null;
        this.city = null;
    }
    
    public User(String ID, String name, String email, String address, String postalCode, String city) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }

    public void login(){
        this.logged = true;
    }

    public void logout(){
        this.logged = false;
    }

    public boolean isLoggedin(){
        return this.logged;
    }

    public boolean isLoggedout(){
        return !this.logged;
    }

    public int getFine() {
        return fine;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    
    public HashMap<books, Boolean> getFinedBooks(){
    	return this.finedBooks;
    }
    
    public HashMap<books, DateServer> getBorrowedBooks(){
    	return this.borrowedBooks;
    }
    
    

    public void borrowBook(books book){
//        if (this.isLoggedin()) {
            if (this.fine == 0) {
                if(this.borrowedBooks.size() <= MAXBOOKS)
                    this.borrowedBooks.put(book, new DateServer());
                else
                    System.out.println("you can't borrow more than five books");
                }
            else
                System.out.println("Can't borrow book, you have fines");
//        }
//        else
//            System.out.println("user login required");
    }

    public void returnBook(books book){
        if(this.isLoggedin())
            if(this.borrowedBooks.containsKey(book)) {
                if (this.finedBooks.containsKey(book)) {
                    this.finedBooks.remove(book);
                    this.fine -= FINEAMOUNT;
                }
                this.borrowedBooks.remove(book);
            }
            else
                System.out.println("this book is not borrowed by you");
        else
            System.out.println("user login required");
    }

    public void checkBooks(){
        Calendar todaysDate = Calendar.getInstance();
        for (Map.Entry<books, DateServer> entry: this.borrowedBooks.entrySet()){
            books book = entry.getKey();
            if (this.finedBooks.containsKey(book))
                continue;
            DateServer bookDate = entry.getValue();
            Calendar bookExpiration = bookDate.getDate();
            bookExpiration.add(Calendar.DAY_OF_YEAR, BORROWLIMIT);
            if (todaysDate.after(bookExpiration)) {
                this.fine += FINEAMOUNT;
                this.finedBooks.put(book, true);
            }
        }
    }

    public DateServer getBookDate(books book){
        if(this.isLoggedin()){
            if(this.borrowedBooks.containsKey(book)){
                return this.borrowedBooks.get(book);
            }
            else
                System.out.println("this book is not borrowed by you");
        }
        else
            System.out.println("user login required");
        return null;
    }
}
	

