public class Problems {
    // Method to check even and odd numbers in an array and count them
    public static void EvenOdd(int[] arr) {
        int Even = 0;
        int Odd = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is Even");
                Even++;
            }
            else {
                System.out.println(arr[i] + " is Odd");
                Odd++;
            }
        }
        System.out.println("Total even numbers: " + Even);
        System.out.println("Total odd numbers: " + Odd);
    }

    // Method to reverse an array
    public static int[] reverse_array(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // Method to determine the factorial of a number
    public static int recursive_factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursive_factorial(n - 1);
        }
    }

    // Method to print the fibonacci series upto a given number
    public static int[] fibonacci(int n) {
        if(n == 0){
            int[] arr = new int[1];
            return arr;
        }

        int[] arr = new int[n];
        arr[0] = 0;
        if(n == 1){ return arr; }

        arr[1] = 1;
        if(n == 2){ return arr; }
        for(int i = 0; i < n - 2; i++){
            arr[i+2] = arr[i+1] + arr[i];
        }
        return arr;
    }

    // Method to check if a string is palindrome or not
    public static boolean palindrome(char[] str) {
        int left = 0;
        int right = str.length - 1;
        while(left < right){
            if(str[left] == str[right]) {
                left++;
                right--;
                continue;
            } else {
                break;
            }
        }
        if(str.length/2 == left)
            return true;
        else
            return false;
    }

    // Method to print a 1 dimensional array of integers
    public static void print_array(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    // Method to determine if a number is prime or not
    public static boolean prime_check(int n) {
        for(int i = n - 1; i > 1; i--){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 9;
        int y = 13;
        int[] numbers = {12, 35, 1, 10, 34, 1};
        char[] s = {'G', 'K', 'F', 'i', 'F', 'K', 'G'};

        EvenOdd(numbers);

        int[] reverse_numbers = reverse_array(numbers);
        System.out.print("\nReversed Array: ");
        print_array(reverse_numbers);

        System.out.println("\n\nFactorial of " + x + " is: " + recursive_factorial(x));

        int[] fibo = fibonacci(x);
        System.out.print("\nFibonacci series upto number " + x + " is: ");
        print_array(fibo);

        if(palindrome(s))
        System.out.println(new String(s) + " is a palindrome.");
        else
        System.out.println(new String(s) + " is not a palindrome.");

        if(prime_check(y))
            System.out.println(y + "\n is a prime numer");
        else System.out.println(y + "\n is not a prime number");
    }
}
