import java.util.*;
import java.time.LocalDate;

public class AirBnb {

//    private static AirBnb singletonInstance;
//
//    private AirBnb() {}
//
//    public static AirBnb getInstance() {
//        if (singletonInstance != null) return singletonInstance;
//        singletonInstance = new AirBnb();
//        return singletonInstance;
//    }
    private HashSet<Utente> utenti = new HashSet<>();
    private HashSet<Utente> host = new HashSet<>();

    public List<String> getListaUtenti() {
        List<String> listaUtenti = new ArrayList<>();
        for (Utente u:utenti) {
            listaUtenti.add(u.getNomeCognome());
        }
        return listaUtenti;
    }

    public void changeToHost(Utente utente, String codice) {
        if (utente.getTipo().equals(Utente.tipoUtente.NORMALE)) {
            utente.setTipo(Utente.tipoUtente.HOST);
            utente.setCodiceHost(codice);
        }
    }

    public void addHost (Utente u){
        if (!u.getTipo().equals(Utente.tipoUtente.NORMALE) && utenti.contains(u)){
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
                if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && !numPrenotazioni.containsKey(p.getAbitazione())) {
                    numPrenotazioni.put(p.getAbitazione(), 1);
                }
                else if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && numPrenotazioni.containsKey(p.getAbitazione())) {
                    numPrenotazioni.put(p.getAbitazione(), numPrenotazioni.get(p.getAbitazione()) + 1);
                }
            }
        }
        //Ordino la mappa la inverto e printo il primo risultato
        List<Map.Entry<Abitazione, Integer>> tempHashset = new ArrayList<>(numPrenotazioni.entrySet());
        tempHashset.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<Abitazione, Integer> o1, Map.Entry<Abitazione, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Collections.reverse(tempHashset);
        //System.out.println(tempHashset);
        System.out.println(tempHashset.get(0));

        return numPrenotazioni;
    }

    public List miglioriHost () {
        HashMap<String, Integer> numHost = new HashMap<>();
        for (Utente u : host) {
            for (Utente i : utenti) {
                for (Prenotazione p: i.getMiePrenotazioni()) {
                    if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && u.getMieAbitazioni().contains(p.getAbitazione()) && !numHost.containsKey(u.getNomeCognome())) {
                    numHost.put(u.getNomeCognome(), 1);
                    }
                    else if (p.getDataInizio().isAfter(LocalDate.now().minusDays(30)) && u.getMieAbitazioni().contains(p.getAbitazione()) && numHost.containsKey(u.getNomeCognome())) {
                        numHost.put(u.getNomeCognome(), numHost.get(u.getNomeCognome()) + 1);
                    }
                }
            }
        }
        List<Map.Entry<String, Integer>> tempHashset = new ArrayList<>(numHost.entrySet());
        tempHashset.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Collections.reverse(tempHashset);
        return tempHashset;
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

    public List giorniUtente (){
        HashMap<String, Long> giorniUtente = new HashMap<>();
        long sommaGiorni = 0;
        for (Utente u: utenti) {
            for (Prenotazione p: u.getMiePrenotazioni()) {
                sommaGiorni = sommaGiorni + p.durataPrenotazione();
            }
            giorniUtente.put(u.getNomeCognome(), sommaGiorni);
            sommaGiorni = 0;
        }
        List<Map.Entry<String, Long>> tempHashset = new ArrayList<>(giorniUtente.entrySet());
        tempHashset.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Collections.reverse(tempHashset);

        HashMap<String, Long> temp2 = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            temp2.put(tempHashset.get(i).getKey(), tempHashset.get(i).getValue());
        }

        List<Map.Entry<String, Long>> temp3 = new ArrayList<>(temp2.entrySet());
        temp3.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Collections.reverse(temp3);
        return temp3;
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
        return somma / tot;
    }
}
