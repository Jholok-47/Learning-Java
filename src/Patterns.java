public class Patterns {
    public static void main(String[] args) {
        for(int i = 9; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print(i);
            }
            for(int k = 0; k < 9 - i; k++){
                System.out.print(" ");
            }
            for(int k = 0; k < 9 - i; k++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
}
