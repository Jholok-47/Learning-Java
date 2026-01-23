public class Test {

    public static void print_2darray(int[][] arr) {
        System.out.println("");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] twoDarr1 = {
                {5, 4, 3, 2, 1},
                {10, 9, 8, 7, 6},
                {15, 14, 13, 12, 11},
                {20, 19, 18, 17, 16},
                {25, 24, 23, 22, 21}
        };

        print_2darray(twoDarr1);
    }
}
