// This is the parent class for different types of users in a system.
package Polymorphism;

public abstract class User {
    private String username;
    private String email;
    private String password;
    private String phoneNumber;

    // Constructor
    public User(String username, String email, String password, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // Method Overriding
    @Override
    public String toString(){
        return "Username: " + username +
                ", Email: " + email;
    }

    // Abstract method for monthly fee
    public abstract int monthlyFee();

    public static String userType() {
        return "Generic User";
    }
}
