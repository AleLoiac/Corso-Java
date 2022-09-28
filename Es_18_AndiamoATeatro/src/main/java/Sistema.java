import java.sql.SQLException;
import java.sql.Statement;

public class Sistema {
    private ConnectionHandler handler;
    public Sistema(ConnectionHandler handler) {this.handler = handler;}

    //prende un utente in imput e lo immette nel DB
    public void registraUtente (Utente utente) throws SQLException {
        String q = "INSERT INTO utente ( nome, cognome, email, indirizzo, telefono )" +
                   " VALUES ("+ utente.getNome() + ", " + utente.getCognome() + ", " + utente.getEmail() + ", " + utente.getIndirizzo()
                   + ", " + utente.getTelefono() + ")";
        //System.out.println(q);
        Statement st = handler.getStatement();
        st.execute(q);
    }
}
