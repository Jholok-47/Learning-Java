public class Methods {
    // Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to find the maximum of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to greet someone with their name
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        int[] num = {10, 20, 15, 7, 8};

        System.out.println(greet("Alice"));
        System.out.println("Sum: " + sum(num[0], num[1]));
        System.out.println("Max: " + max(num[0], num[1]));
        System.out.println(num[0] + " is even: " + isEven(num[0]));
        System.out.println(num[1] + " is even: " + isEven(num[1]));

        for(int i = 0; i<num.length; i++){
            if(isEven(num[i])){
                System.out.println(num[i] + " is even.");
            } else {
                System.out.println(num[i] + " is odd.");
            }
        }
    }
}
