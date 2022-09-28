import java.sql.SQLException;

public class Main_Teatro {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ConnectionHandler connectionHandler = new ConnectionHandler(ConnectionHandler.DB_URL, "AndiamoATeatro",
                "public", "postgres", "password78");
        Sistema sistema = new Sistema(connectionHandler);

        Utente utente1 = new Utente("\'Gianni\'", "\'Fantoni\'","\'gianni5@gmail.com\'", "\'Via_dei_Franchi5\'", "\'3334455666\'");
        sistema.registraUtente(utente1);
    }
}
