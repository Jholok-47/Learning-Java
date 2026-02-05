package Interface;

public class PasswordEncryptorV2 implements PasswordEncryptor{
    private String key;
    private String key2;

    public PasswordEncryptorV2(String key, String key2) {
        this.key = key;
        this.key2 = key2;
    }
    public String encrypt(String password) {
        return key + password + key2;
    }
}
