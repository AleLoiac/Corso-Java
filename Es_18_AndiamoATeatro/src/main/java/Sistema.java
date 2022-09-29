import java.sql.ResultSet;
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

    public boolean isRegistered(Utente utente) throws SQLException {
        String q = "SELECT * FROM utente";
        Statement st = handler.getStatement();
        ResultSet rs = st.executeQuery(q);
        while (rs.next()) {
            if (("'"+rs.getString("email")+"'").equals(utente.getEmail())) {
                return true;
            }
        }
        return false;
    }

    public void prenotaRappresentazione (Utente u, Rappresentazione rap, int id, int fila, int numero) throws SQLException {
        if (isRegistered(u) == true){
            System.out.println("Prezzo: " + rap.getPrezzo());
            String q = "INSERT INTO prenotazione ( id, fila, numero, fk_utente, fk_rappresentazione )" +
                    " VALUES ("+ id + ", " + fila + ", " + numero + ", " + u.getEmail()
                    + ", " + rap.getId() + ")";
            System.out.println(q);
            Statement st = handler.getStatement();
            st.execute(q);
        }
        else{
            System.out.println("Utente non registrato");
        }
    }
}
