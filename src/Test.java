import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        int avg;
        int count = 0;
        for(int i = 1; i < responseTimes.size(); i++){
            int total = 0;
            for(int j = i - 1; j >= 0; j--){
                total += responseTimes.get(j);
            }
            avg = total/i;
            if(responseTimes.get(i) > avg)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> responseTimes = new ArrayList<>();
        System.out.println("How many response times will you enter?");
        int n = sc.nextInt();
        System.out.println("Enter the response times: ");
        for(int i = 0; i < n; i++){
            responseTimes.add(sc.nextInt());
        }

        int regressions = countResponseTimeRegressions(responseTimes);
        System.out.println("Number of response time regressions: " + regressions);
    }
}
