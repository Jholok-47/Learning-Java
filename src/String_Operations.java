public class String_Operations {
    public static void main(String[] args) {
        // Declare and initialize string variables
        String firstName = "John";
        String lastName = "Doe";

        // Concatenate strings
        String fullName = firstName + " " + lastName;

        // Convert to uppercase
        String upperCaseName = fullName.toUpperCase();

        // Get the length of the full name
        int nameLength = fullName.length();

        // Print results to the console
        System.out.println("Full Name: " + fullName);
        System.out.println("Uppercase Name: " + upperCaseName);
        System.out.println("Length of Full Name: " + nameLength);
    }
}
