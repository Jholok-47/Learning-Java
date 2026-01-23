public class Problems {
    // Method to print a 1 dimensional array of integers
    public static void print_array(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Method to print a 2 dimensional array of integers
    public static void print_2D_array(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Method to check even and odd numbers in an array and count them
    public static void EvenOdd(int[] arr) {
        System.out.println("");
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

    // Method to determine if a number is prime or not
    public static boolean prime_check(int n) {
        for(int i = n - 1; i > 1; i--){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    // Method to search an element in an array using linear search algorithm
    public static boolean linear_search(int n, int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(n == arr[i])
                return true;
        }
        return false;
    }

    // Method to sort an array in ascending order
    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Method to search an element from an array using binary search algorithm
    public static int binary_search(int n, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right)/2;

        if(n < arr[left] || n > arr[right])
            return -1;

        while(arr[mid] != n){
            if(n < arr[mid]){
                right = mid - 1;
                mid = (left + right)/2;
            }
            else if(n > arr[mid]){
                left = mid + 1;
                mid = (left + right)/2;
            }
        }
        return mid;
    }

    // Method to find the number of vowerls in a given string
    public static void vowel_consonent(String str) {
        int vowels = 0;
        int consonents = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
                else consonents++;
            }
        }
        System.out.println("Calculating the numbers of vowels and consonents in the above sentence...");
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonents = " + consonents + "\n");
    }

    // Method to print the duplicate elements in an array if thee are any
    public static void duplicate(int[] arr) {
        System.out.print("Duplicate elements in the array are: ");
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");
    }

    // Method to add two 2D arrays
    public static int[][] Add_2D_Arrays(int[][] arr1, int[][] arr2) {
        int[][] addition = new int[5][5];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                addition[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return addition;
    }

    public static void main(String[] args) {
        int x = 9;
        int y = 13;
        int z = 57;
        int[] numbers = {12, 35, 1, 10, 34, 45, 23, 49, 81, 57, 35, 45};
        int[][] twoDarr1 = {
                {5, 4, 3, 2, 1},
                {10, 9, 8, 7, 6},
                {15, 14, 13, 12, 11},
                {20, 19, 18, 17, 16},
                {25, 24, 23, 22, 21}
        };
        int[][] twoDarr2 = {
                {5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9}
        };
        char[] s = {'G', 'K', 'F', 'i', 'F', 'K', 'G'};
        String str1 = "A rabid dog bit me. Now I have rabies.";
        System.out.println("");

        System.out.println(str1);
        vowel_consonent(str1);

        duplicate(numbers);

        System.out.print("Unsorted array: ");
        print_array(numbers);
        if(linear_search(z, numbers))
            System.out.println(z + " exists in the array numbers.\n");
        else System.out.println(z + " does not exist in the array numbers.\n");

        int[] sorted_numbers = sort(numbers);
        System.out.print("Sorted array: ");
        print_array(sorted_numbers);
        if(binary_search(z, sorted_numbers) > 0)
            System.out.println("The number " + z + " is in index " + binary_search(z, sorted_numbers));
        else System.out.println("\n" + z + " does not exist in the array numbers.");

        int[] reverse_numbers = reverse_array(numbers);
        System.out.print("\nReversed Array: ");
        print_array(reverse_numbers);

        System.out.println("\nFactorial of " + x + " is: " + recursive_factorial(x));

        int[] fibo = fibonacci(x);
        System.out.print("\nFibonacci series upto number " + x + " is: ");
        print_array(fibo);

        if(palindrome(s))
        System.out.println("\n" + new String(s) + " is a palindrome.");
        else System.out.println("\n\n" + new String(s) + " is not a palindrome.");

        if(prime_check(y))
            System.out.println("\n" + y + " is a prime number");
        else System.out.println("\n" + y + " is not a prime number");

        EvenOdd(numbers);

        System.out.println("\nA 2 dimensional array: ");
        print_2D_array(twoDarr1);
        System.out.println("\nAnother 2 dimensional array: ");
        print_2D_array(twoDarr2);
        System.out.println("\nAddition of these two arrays: ");
        print_2D_array(Add_2D_Arrays(twoDarr1, twoDarr2));
    }
}
