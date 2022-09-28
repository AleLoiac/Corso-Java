import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHandler {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432";

    public final String connectionUrl;

    private Connection connection;

    public ConnectionHandler(String dbUrl, String dbName, String schema, String username, String password) throws ClassNotFoundException {
        this.connectionUrl = dbUrl + "/" + dbName
                + "?currentSchema=" + schema
                + "&user=" + username
                + "&password=" + password;

        // Occorre conoscere il nome del driver e il suo package
        Class.forName("org.postgresql.Driver");
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || this.connection.isClosed()) {
            this.connection = DriverManager.getConnection(connectionUrl);
        }
        return this.connection;
    }

    public void closeConnection() throws SQLException {
        if (!(connection == null || this.connection.isClosed())) {
            this.connection.close();
            this.connection = null;
        }
    }

    public Statement getStatement() throws SQLException {
        connection = getConnection();
        return connection.createStatement();
    }
}
