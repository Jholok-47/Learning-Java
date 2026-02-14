import Polymorphism.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String str = "Valar Morghulis";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(6));
        System.out.println(str.substring(6, 14));
        System.out.println(str.replace("o", "0"));
        System.out.println(str.concat("oOo"));
        System.out.println(str.contains("Morghulis"));
        System.out.println(str.indexOf("r"));
    }
}
