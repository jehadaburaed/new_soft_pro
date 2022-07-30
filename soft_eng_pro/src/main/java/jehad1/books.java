package jehad1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class books {
	
	private String title;
    private String author;
    private String signature;
    
    public books(){
        this.title = null;
        this.author = null;
        this.signature=null;
    }
    
    public books(String title, String author, String signature){
        this.title = title;
        this.author = author;
        this.signature=signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSignature() {
        return signature;
    }

}
