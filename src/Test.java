import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void print_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> responseTimes = new ArrayList<>();
        System.out.println("How many response times will you enter?");
        int n = sc.nextInt();
        System.out.println("Enter the response times: ");

        for (int i = 0; i < n; i++) {
            responseTimes.add(sc.nextInt());
        }

        System.out.print("The response times you entered are: ");
        for (int time : responseTimes) {
            System.out.print(time + " ");
        }
    }
}
