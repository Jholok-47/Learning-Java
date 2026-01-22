public class Patterns {
    // Method for printing a numerical void triangle
    public static void void_triangle(int a) {
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

    // Method to print a lower right numerical triangle
    public static void lr_triangle(int a) {
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // Method to print an upper left numerical triangle
    public static void ul_triangle(int a) {
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a - i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // Method to print an upper right numerical triangle
    public static void ur_triangle(int a) {
        for(int i = 0; i < a; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < a - i; k++){
                System.out.print(k);
            }
            System.out.println("");
        }
    }

    // Method to print a numerical square
    public static void num_square(int a) {
        for(int i = 1; i <= a; i++){
            for(int j = i; j <= (a - 1); j++){
                System.out.print(" ");
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            for(int l = i - 1; l > 0; l--){
                System.out.print(l + " ");
            }
            System.out.println("");
        }
        for(int i = 1; i <= a - 1; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
                System.out.print(" ");
            }
            for(int k = 1; k <= a - i; k++){
                System.out.print(k + " ");
            }
            for(int l = a - 1 - i; l > 0; l--){
                System.out.print(l + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int x = 9;
        void_triangle(x);
        System.out.println("");

        ll_triangle(x);
        System.out.println("");

        lr_triangle(x);
        System.out.println("");

        ul_triangle(x);
        System.out.println("");

        ur_triangle(x);
        System.out.println("");

        num_square(x);
        System.out.println("");
    }
}
