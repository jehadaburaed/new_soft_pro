package jehad1;

public class admin_user {
    private String password ;
    private boolean loggedin = false;
    
    public admin_user(){
        this.password = "adminadmin";
    }

//    public Admin(String password){
//        this.password = password;
//    }

    public void login(String password){
            if(this.password.contains(password))
                this.loggedin = true;
    }

    public void logout(){
            this.loggedin = false;
    }

    public boolean isLoggedin(){
        return this.loggedin;
    }

    public boolean isLoggedout(){
        return !this.loggedin;
    }
}
