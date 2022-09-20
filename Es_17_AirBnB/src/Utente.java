import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Utente {
    private String nomeCognome;
    private String email;
    private String indirizzo;
    private Utente.tipoUtente tipo;
    private String codiceHost;
    public enum tipoUtente {NORMALE, HOST, SUPERHOST}
    private List<Abitazione> mieAbitazioni = new ArrayList<>();
    private LinkedList<Prenotazione> miePrenotazioni = new LinkedList<>();

    public Utente(String nomeCognome, String email, String indirizzo) {
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.indirizzo = indirizzo;
        this.tipo = Utente.tipoUtente.NORMALE;
        this.codiceHost = null;
    }

    public String getNomeCognome() {return nomeCognome;}
    public String getEmail() {return email;}
    public String getIndirizzo() {return indirizzo;}
    public String getCodiceHost() {return codiceHost;}

    public void setCodiceHost(String codiceHost) {this.codiceHost = codiceHost;}

    public Utente.tipoUtente getTipo() {return tipo;}
    public void setTipo(Utente.tipoUtente tipo) {this.tipo = tipo;}

    public void addAbitazione (Abitazione abitazione){
        if (!this.tipo.equals(tipoUtente.NORMALE)) {
            mieAbitazioni.add(abitazione);
            System.out.println("Aggiunto alle tue abitazioni");
        }
        else{
            System.out.println("Non sei ancora un host");
        }
    }
    public List<Abitazione> getMieAbitazioni() {return mieAbitazioni;}

    public void addPrenotazione (Prenotazione prenotazione){
        miePrenotazioni.add(prenotazione);
    }

    public Prenotazione lastPrenotazione (){
        return miePrenotazioni.peekLast();
    }

    public void lasciaFeedback (){

    }
}
