package Generics;

public class Main {
    public static void main(String[] args) {
        MyGenericList<Integer> myGenericListForInteger = new MyGenericList<>(new Integer[10]);
        myGenericListForInteger.add(1);
        myGenericListForInteger.add(2);
        myGenericListForInteger.add(3);
        System.out.println(myGenericListForInteger.get(0)); // Output: 1
        System.out.println(myGenericListForInteger.get(1)); // Output: 2
        System.out.println(myGenericListForInteger.get(2)); // Output: 3

        int myGenericSum = 0;
        for(int i = 0; i < myGenericListForInteger.length(); i++){
            myGenericSum += myGenericListForInteger.get(i);
        }
        System.out.println("Sum of integers in myGenericListForInteger: " + myGenericSum);

        MyGenericList<Double> myListGenericForDouble = new MyGenericList<>(new Double[10]);
        myListGenericForDouble.add(1.2);
        myListGenericForDouble.add(2.3);
        myListGenericForDouble.add(5.6);
        System.out.println(myListGenericForDouble.get(0)); // Output: 1.2
        System.out.println(myListGenericForDouble.get(1)); // Output: 2.3
        System.out.println(myListGenericForDouble.get(2)); // Output: 5.6
        System.out.println("Average of doubles in myListGenericForDouble: " + myListGenericForDouble.avg());

        Compare<Integer> compareForInteger = new Compare<>();
        System.out.println("Greater value between 5 and 3 is: " + compareForInteger.greater(5, 3));

        Compare<Double> compareForDouble = new Compare<>();
        System.out.println("Greater value between 5.2 and 3.7 is: " + compareForDouble.greater(5.2, 3.7));

        System.out.println("------------------------------------------");
        System.out.println("Sum of odd and even numbers in the array:");
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] arr2 = {1.5, 2.3, 3.7, 4.1, 5.6, 6.8, 7.2, 8.9, 9.4, 10.0};
        System.out.println("Using Double array: 1.5, 2.3, 3.7, 4.1, 5.6, 6.8, 7.2, 8.9, 9.4, 10.0");
        OddEvenSum(arr2);
        System.out.println("Using Integer array: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
        OddEvenSum(arr);
    }

    public static <T extends Number> void OddEvenSum(T[] arr){
        if(arr.length == 0){
            throw new IllegalStateException("Array is empty");
        }
        double oddSum = 0;
        double evenSum = 0;
        long round = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getClass() == Double.class) {
                round = Math.round(arr[i].doubleValue()); // Round the double value to the nearest long
            } else round = arr[i].longValue(); // For integers, just get the long value

            if(round % 2 == 0){
                evenSum += round;
            } else {
                oddSum += round;
            }
        }
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}