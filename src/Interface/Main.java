package Interface;

public class Main {
    public static void main(String[] args) {
//        PasswordEncryptorV1 encryptor = new PasswordEncryptorV1();
//        PasswordEncryptorV2 encryptorV2 = new PasswordEncryptorV2("xyz", "789");
//        User user1 = new User("Shimul", "password123", encryptorV2);
//        System.out.println(user1);

        UserService userService = new UserService(new PostgresConnection());
        userService.savaData("User data for MySQL");
    }
}
