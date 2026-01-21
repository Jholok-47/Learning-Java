public class Problems {
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

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int[] reverse_numbers = new int[6];

        EvenOdd(numbers);
        reverse_numbers = reverse_array(numbers);

        System.out.println("\nReversed Array:");
        for(int i = 0; i < reverse_numbers.length; i++) {
            System.out.print(" " + reverse_numbers[i]);
        }
    }
}
