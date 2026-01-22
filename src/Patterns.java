public class Patterns {
    // Method for printing a numerical void triangle
    public static void nvoid(int a) {
        for (int i = a; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            for (int k = 0; k < a - i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < a - i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    // Method to print a lower left numerical triangle
    public static void ll_triangle(int a){
        for(int i = 0; i < a; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }



    public static void main(String[] args) {
        int x = 9;
        nvoid(x);
        System.out.println("");

        ll_triangle(x);
        System.out.println("");
    }
}
