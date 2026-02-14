package Interface;

public class MysqlConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL database.");
    }

    @Override
    public void save(String data) {
        System.out.println("Saved data to MySQL database: " + data);
    }

    @Override
    public void delete(String dataId) {
        System.out.println("Deleted data with ID " + dataId + " from MySQL database.");
    }

    @Override
    public void update(String dataId, String newData) {
        System.out.println("Updated data with ID " + dataId + " to new data: " + newData);
    }
}
