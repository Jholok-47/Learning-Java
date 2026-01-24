import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter number of elements to add to the list: ");
        int arr_size = sc.nextInt();
        System.out.println("Enter " + arr_size + " integers: ");
        for (int i = 0; i < arr_size; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.print("\nNumbers in the list: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
