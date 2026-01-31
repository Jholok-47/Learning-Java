package Polymorphism;

public class Main {
    public static void main(String[] args) {
        HostUser hostUser1 = new HostUser("Alice", "alice@gmail.com", 20, 101);
        System.out.println(hostUser1);

        BasicUser basicUser1 = new BasicUser("Bob", "bob@gmail.com", "bob123", "123-456-7890", 15 );
        System.out.println(basicUser1);

        System.out.println(monthlyChargeForHostUser(hostUser1));
        System.out.println(monthlyChargeForBasicUser(basicUser1));

        System.out.println(monthlyChargeForUser(hostUser1));
        System.out.println(monthlyChargeForUser(basicUser1));
    }

    public static int monthlyChargeForHostUser(HostUser hostUser) {
        return 30 * hostUser.getHostMonthlyFee();
    }

    public static int monthlyChargeForBasicUser(BasicUser basicUser) {
        return 30 * basicUser.getBasicMonthlyFee();
    }

    public static int monthlyChargeForUser(User user) {
        return user.monthlyFee();
    }
}
