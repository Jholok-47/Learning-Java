package Interface;

public class UserService {
    private DatabaseConnection dbConnection;

    public UserService(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void savaData(String data) {
        dbConnection.connect();
        dbConnection.save(data);
        dbConnection.disconnect();
    }

    public void deleteData(String dataId) {
        dbConnection.connect();
        dbConnection.delete(dataId);
        dbConnection.disconnect();
    }

    public void updateData(String dataId, String newData) {
        dbConnection.connect();
        dbConnection.update(dataId, newData);
        dbConnection.disconnect();
    }
}
