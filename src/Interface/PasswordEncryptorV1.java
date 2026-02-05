package Interface;

public class PasswordEncryptorV1 implements PasswordEncryptor {
    @Override
    public String encrypt(String password) {
        return "123" + password + "123";
    }
}
