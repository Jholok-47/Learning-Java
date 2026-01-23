public class Test {
    public static void armstrong(int n) {
        int x = n;
        int digit;
        int arm = 0;
        int count = 0;
        while(x / 10 != 0){
            x = x / 10;
            count++;
        }
        x = n;
        for(int i = 0; i <= count; i++){
            digit = x % 10;
            x /= 10;
            arm += Math.pow(digit, count+1);
        }
        if(arm == n)
            System.out.println("True");
        else System.out.println("False");
    }


    public static void main(String[] args) {
       int x = 371;
        armstrong(x);
    }
}
