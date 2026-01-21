public class Methods {
    // Method to calculate the sum of two integers
    public static int sum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    // Method to find the maximum number of an array
    public static int max(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the second maximum number if an array
    public static int second_max(int[] arr){
        int temp = -1;
        int max = max(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < max && arr[i] > temp)
                temp = arr[i];
        }
        return temp;
    }

    // Method to find the minimum number of an array
    public static int min(int[] arr) {
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    // Method to find the second minimum number of an array
    public static int second_min(int[] arr){
        int temp = Integer.MAX_VALUE;
        int min = min(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > min && arr[i] < temp)
                temp = arr[i];
        }
        return temp;
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
        int[] num = {10, 20, 15, 7, 8, 20, 30, 40, 7, 8, 40, 31};

        System.out.println(greet("Alice"));
        System.out.println("Sum: " + sum(num));
        System.out.println("Max: " + max(num));
        System.out.println("2nd Max: " + second_max(num));
        System.out.println("Min: " + min(num));
        System.out.println("2nd Min: " + second_min(num) + "\n");

        for(int i = 0; i<num.length; i++){
            if(isEven(num[i])){
                System.out.println(num[i] + " is even.");
            } else {
                System.out.println(num[i] + " is odd.");
            }
        }
    }
}
