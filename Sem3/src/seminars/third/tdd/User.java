package seminars.third.tdd;

public class User {

    String login;
    String password;
    boolean aut = false;
    boolean admin;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.admin = true;
    }

    public User() {
        this.login = "login";
        this.password = "password";
        this.admin = false;
    }

    //3.6.
    public boolean authenticate(String login, String password) {
        if(this.login.equals(login) && this.password.equals(password)) {
            aut = true;
            return true;
        }else {
            return false;
        }
    }
}