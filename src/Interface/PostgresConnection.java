package Interface;

public class PostgresConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL database.");
    }

    @Override
    public void save(String data) {
        System.out.println("Saved data to PostgreSQL database: " + data);
    }

    @Override
    public void delete(String dataId) {
        System.out.println("Deleted data with ID " + dataId + " from PostgreSQL database.");
    }

    @Override
    public void update(String dataId, String newData) {
        System.out.println("Updated data with ID " + dataId + " to new data: " + newData);
    }
}
