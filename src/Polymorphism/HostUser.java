// This is a subclass representing a host user in the system.
package Polymorphism;

public class HostUser extends User {
    private int hostID;
    private int hostMonthlyFee;

    // Constructor
    public HostUser(String username, String email, int hostMonthlyFee, int hostID) {
        super(username, email, null, null); // Call to Inheritance.User constructor with password and phoneNumber as null
        this.hostMonthlyFee = hostMonthlyFee;
        this.hostID = hostID;
    }

    // Method Overriding
    @Override
    public String toString(){
        return super.toString() + ", HostID: " + hostID + ", Monthly Fee: " + hostMonthlyFee;
    }

    // Getter for monthlyFee
    public int getHostMonthlyFee() {
        return hostMonthlyFee;
    }

    // This method is the abstract method implementation from User class
    @Override
    public int monthlyFee() {
        return 30 * hostMonthlyFee;
    }
}
