package Inheritance;

public class BasicUser extends User{

    int monthlyFee;

    // Constructor
    public BasicUser(String username, String email, String password, String phoneNumber, int monthlyFee) {
        super(username, email, password, phoneNumber); // Call to Inheritance.User constructor
        this.monthlyFee = monthlyFee;
    }

    // Method Overriding
    @Override
    public String toString(){
        return "Monthly Fee: " + monthlyFee + ", " + super.toString();
    }

    // Getter for monthlyFee
    public int getMonthlyFee() {
        return monthlyFee;
    }
}
