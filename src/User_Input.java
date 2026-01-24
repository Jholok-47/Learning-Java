import java.util.Scanner;
public class User_Input {
    // Method to print a 1 dimensional array of integers
    public static void print_array(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Method to take a 1 dimensional array as user input
    public static int[] input_1D_array(Scanner sc) {
        int arr_size;
        System.out.print("Enter size of an array: " );
        arr_size = sc.nextInt();
        int[] arr = new int[arr_size];

        System.out.print("Enter " + arr_size + " integers: ");
        for(int i = 0; i < arr_size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print_array(input_1D_array(sc));
    }
}
