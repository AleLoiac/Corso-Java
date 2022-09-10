import java.util.Hashtable;
public abstract class ProdottoInCatalogo {

    public ProdottoInCatalogo(String titolo, int anno, genere Genere, parentalGuidance PG, originale Or) {
        this.titolo = titolo;
        this.anno = anno;
        this.genere = Genere;
        this.pg = PG;
        this.or = Or;
        this.voti = new Hashtable<>();
    }

    private ProdottoInCatalogo [] prodotti;

    private String titolo;

    public String getTitolo() {
        return titolo;
    }

    private genere genere;

    private int anno;

    private parentalGuidance pg;

    private originale or;

    private String [] cast; //fare array di oggetti Attore[]

    private Hashtable<Utente, Integer> voti;

    public enum genere {
        ANIMAZIONE,
        AZIONE,
        COMMEDIA,
        DRAMMATICO,
        FANTASCIENZA,
        FANTASY,
        HORROR,
        STORICO

    }

    public enum parentalGuidance {
        _1_14,
        _14_18,
        _OVER_18
    }

    public enum originale {
        ORIGINALE,
        REMAKE
    }

    public void assegnaVotoUtente(Utente utente, int i){
        if(utente!=null){
            voti.put(utente, i);
        }
    }

    public void printVotiUtenti(){
        for(Utente utente : voti.keySet()){
            System.out.println(utente.getNome() + " Voto: " + voti.get(utente));
        }
    }

}
