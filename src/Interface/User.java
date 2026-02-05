package Interface;

public class User {
    private String username;
    private String password;
    private PasswordEncryptor encryptor;

    public User(String username, String password, PasswordEncryptor encryptor) {
        this.encryptor = encryptor;
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encryptor.encrypt(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}




