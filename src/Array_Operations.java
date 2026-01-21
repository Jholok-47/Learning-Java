public class Array_Operations {
    public static void main(String[] args) {
        int [] numbers = {5, 3, 8, 1, 2};
        int [] arr = new int[5];
        int [][] arr2 = new int[3][4];

        System.out.println(arr[2] + "\n"); // Accessing the third element

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("");

        for(int i=0; i < arr2.length; i++) {
            for(int j=0; j < arr2[i].length; j++) {
                arr2[i][j] = i + j;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}