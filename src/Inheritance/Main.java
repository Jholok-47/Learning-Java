package Inheritance;

public class Main {
    public static void main(String[] args) {
        HostUser hostUser1 = new HostUser("Alice", "alice@gmail.com", 500, 101);
        System.out.println(hostUser1);

        BasicUser basicUser1 = new BasicUser("Bob", "bob@gmail.com", "bob123", "123-456-7890", 300);
        System.out.println(basicUser1);

        System.out.println(monthlyCharge(hostUser1));
    }

    public static int monthlyCharge(HostUser hostUser) {
        return hostUser.getMonthlyFee();
    }
}
