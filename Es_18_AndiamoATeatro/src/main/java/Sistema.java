import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sistema {

    private ConnectionHandler handler;

    public Sistema(ConnectionHandler handler) {this.handler = handler;}

    //prende un utente in imput e lo immette nel DB
    public void registraUtente (Utente utente) throws SQLException {
        String q = "INSERT INTO utente VALUES (" +
                "utente.nome" + "'" + utente.getNome() + "'" + ", " +
                "utente.cognome" +"'" + utente.getCognome() + "'" + ", " +
                "utente.email" + "'" + utente.getEmail() + "'" + ", " +
                "utente.indirizzo" + "'" + utente.getIndirizzo() + "'" + ", " +
                "utente.telefono" + "'" + utente.getTelefono() + "'" + ");";
        System.out.println(q);
        Statement st = handler.getStatement();
        ResultSet rs = st.executeQuery(q);
    }
}
