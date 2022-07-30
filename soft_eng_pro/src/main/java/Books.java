package jehad;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Books {

	String str = "Head First Java";
	String str2 = "Ali Ahmad";
	String str3 = "Ali99";
	boolean strSearch = false;
	boolean strSearched = false;
	String strSearching = " ";
	ArrayList<ArrayList> strr = new ArrayList<ArrayList>();

	public void search(String searching) {

		int searchListLength = strr.size();

		for (int i = 0; i < searchListLength; i++) {
			ArrayList<String> strr3 = new ArrayList<String>();
			strr3 = strr.get(i);
			for (int j = 0; j < 3; j++) {

				if (strr3.get(j).contains(searching)) {
					strSearched = true;
					strSearching = strr3.get(2);
				}
			}

			if (strSearched) {
				isFound();
			}
		}

	}

	public boolean isFound() {

		if (strSearched) {
			System.out.println("the book with code " + strSearching + " is found");

		}

		return strSearched;

	}

	public boolean isExist() {

		return strSearch;

	}

	public void addingBook(String st, String st2, String st3) {
		ArrayList<String> bookDef = new ArrayList<String>();
		bookDef.add(st);
		bookDef.add(st2);
		bookDef.add(st3);

		ArrayList<String> strr2;

		int searchListLength = strr.size();

		for (int i = 0; i < searchListLength; i++) {
			strr2 = strr.get(i);
			for (int j = 0; j < 3; j++) {

				if (strr2.get(j).equals(bookDef.get(j))) {
					strSearch = true;
					return;
				}

			}

		}

		strr.add(bookDef);
		strSearch = false;

	}

}
