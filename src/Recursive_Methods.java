import java.util.Scanner;
public class Recursive_Methods {
    public static int sum(int s, int i, int n) {
            if(i > n) {
                return s;
            }
            s += i;
            return sum(s, i + 1, n);
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        System.out.println("Enter a number greater than the first number: ");
        int m = sc.nextInt();
        int result = sum(0, n, m);
        System.out.println("The sum from " + n + " to " + m + " is: " + result);
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
