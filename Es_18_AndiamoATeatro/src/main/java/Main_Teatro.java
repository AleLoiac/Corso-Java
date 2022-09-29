import org.postgresql.util.PSQLException;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Main_Teatro {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ConnectionHandler connectionHandler = new ConnectionHandler(ConnectionHandler.DB_URL, "AndiamoATeatro",
                "public", "postgres", "password78");
        Sistema sistema = new Sistema(connectionHandler);

        Utente utente1 = new Utente("\'Gianni\'", "\'Fantoni\'","\'gianni@gmail.com\'", "\'Via_dei_Franchi\'", "\'3334455666\'");
        Utente utente2 = new Utente("\'Marco\'", "\'Franchi\'","\'marco@gmail.com\'", "\'Via_dei_Giunchi\'", "\'3334466777\'");

        //Rappresentazione spettacolo1 = new Rappresentazione(LocalDateTime.of(2022, 12, 9, 21, 30), "Teatro la Scala", 30.00, 1,900, "Sala1");

        try {
            sistema.registraUtente(utente1);
        } catch (PSQLException e) {
            System.out.println("Utente già registrato");
        }

        System.out.println(sistema.isRegistered(utente1));
        System.out.println(sistema.isRegistered(utente2));

        //sistema.prenotaRappresentazione(utente1, spettacolo1, 876, 5, 12);
    }

}
