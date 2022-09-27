import java.sql.Connection;

public class ConnectionHandler {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/";

    public final String connectionUrl;

    private Connection connection;

    public ConnectionHandler(String dbUrl, String dbName, String schema, String username, String password) throws ClassNotFoundException {
        this.connectionUrl = dbUrl + dbName
                + "?currentSchema=" + schema
                + "&user=" + username
                + "&password=" + password;

        // Occorre conoscere il nome del driver e il suo package
        Class.forName("org.postgresql.Driver");
    }
}
