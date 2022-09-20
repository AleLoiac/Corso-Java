import java.util.ArrayList;
import java.util.List;

public class AirBnb {

    private List<Utente> host = new ArrayList<>();
    private List<Utente> utenti = new ArrayList<>();

    public void changeToHost(Utente utente, String codice) {
        if (utente.getTipo().equals(Utente.tipoUtente.NORMALE)) {
            utente.setTipo(Utente.tipoUtente.HOST);
            utente.setCodiceHost(codice);
        }
    }

    public void addHost (Utente u){
        if (!u.getTipo().equals(Utente.tipoUtente.NORMALE)){
            host.add(u);
            System.out.println("Utente aggiunto");
        }
        else{
            System.out.println("L'utente non è host");
        }
    }

    public List idToAbitazioni (String codice){
        for (Utente u : host) {
            if(codice.equals(u.getCodiceHost())){
                return u.getMieAbitazioni();
            }
        }
        return null;
    }

    public void addUtente (Utente u){
        utenti.add(u);
    }

    public Prenotazione idToUltimaPrenotaz (String codice){
        for (Utente u : utenti){
            if(codice.equals(u.getCodiceHost())){
                return u.lastPrenotazione();
            }
        }
        return null;
    }
}
