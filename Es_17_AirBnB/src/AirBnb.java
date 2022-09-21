import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;

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

    public HashMap abitazioneGettonata (){
        HashMap<Abitazione, Integer> numPrenotazioni = new HashMap<>();
        for (Utente u:utenti) {
            for (Prenotazione p: u.getMiePrenotazioni()) {
                if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && !numPrenotazioni.containsKey(p.getNomeAbitazione())) {
                    numPrenotazioni.put(p.getNomeAbitazione(), 1);
                }
                else if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && numPrenotazioni.containsKey(p.getNomeAbitazione())) {
                    numPrenotazioni.put(p.getNomeAbitazione(), numPrenotazioni.get(p.getNomeAbitazione()) + 1);
                }
            }
        }
        return numPrenotazioni;
    }

    public HashMap miglioriHost () {
        HashMap<String, Integer> numHost = new HashMap<>();
        for (Utente u : host) {
            for (Utente i : utenti) {
                for (Prenotazione p: i.getMiePrenotazioni()) {
                    if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && u.getMieAbitazioni().contains(p.getNomeAbitazione()) && !numHost.containsKey(u.getNomeCognome())) {
                    numHost.put(u.getNomeCognome(), 1);
                    }
                    else if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && u.getMieAbitazioni().contains(p.getNomeAbitazione()) && numHost.containsKey(u.getNomeCognome())) {
                        numHost.put(u.getNomeCognome(), numHost.get(u.getNomeCognome()) + 1);
                    }
                }
            }
        }
        return numHost;
    }
    
    public List listaSuperHost (){
        List<Utente> superhost = new ArrayList<>();
        for (Utente h : host) {
            if (h.getTipo().equals(Utente.tipoUtente.SUPERHOST)) {
                listaSuperHost().add(h);
            }
        }
        return listaSuperHost();
    }

    public int mediaLetti (){
        List<Integer> numLetti = new ArrayList<>();
        for (Utente u: host) {
            for (Abitazione a: u.getMieAbitazioni()) {
                numLetti.add(a.getNumLetti());
            }
        }
        int tot = numLetti.size();
        int somma = 0;
        for (Integer i : numLetti) {
            somma = i + somma;
        }
        int media = somma / tot;
        return media;
    }
}
