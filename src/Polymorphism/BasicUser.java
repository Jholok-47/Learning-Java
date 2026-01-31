package Polymorphism;

public class BasicUser extends User{

    int basicMonthlyFee;

    // Constructor
    public BasicUser(String username, String email, String password, String phoneNumber, int basicMonthlyFee) {
        super(username, email, password, phoneNumber); // Call to Inheritance.User constructor
        this.basicMonthlyFee = basicMonthlyFee;
    }

    // Method Overriding
    @Override
    public String toString(){
        return super.toString() + ", Monthly Fee: " + basicMonthlyFee;
    }

    // Getter for monthlyFee
    public int getBasicMonthlyFee() {
        return basicMonthlyFee;
    }

    @Override
    public int monthlyFee() {
        return 30 * basicMonthlyFee;
    }
}
