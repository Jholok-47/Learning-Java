package Inheritance;

public class HostUser extends User {
    private int hostID;
    private int monthlyFee;

    // Constructor
    public HostUser(String username, String email, int monthlyFee, int hostID) {
        super(username, email, null, null); // Call to Inheritance.User constructor with password and phoneNumber as null
        this.monthlyFee = monthlyFee;
        this.hostID = hostID;
    }

    // Method Overriding
    @Override
    public String toString(){
        return "Monthly Fee: " + monthlyFee +
                ", HostID: " + hostID + ", " +
                super.toString();
    }

    // Getter for monthlyFee
    public int getMonthlyFee() {
        return monthlyFee;
    }
}
