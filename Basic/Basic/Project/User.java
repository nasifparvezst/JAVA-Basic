import java.io.Serializable;

public abstract class User implements Serializable {
    protected String name;
    protected String email;
    protected String password;
    protected double account;
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public abstract void displayMenu();
    public abstract void viewProfile();

    public String getEmail() {
        return email;
    }
    public boolean checkPassword(String pass) {
        return password.equals(pass);
    }
}