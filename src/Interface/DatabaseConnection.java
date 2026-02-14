package Interface;

public interface DatabaseConnection {
    void connect();
    void disconnect();
    void save(String data);
    void delete(String dataId);
    void update(String dataId, String newData);
}
