import java.util.ArrayList;
import java.util.Hashtable;
public abstract class ProdottoInCatalogo {

    public ProdottoInCatalogo(String titolo, int anno, genere Genere, parentalGuidance PG, originale Or) {
        this.titolo = titolo;
        this.anno = anno;
        this.genere = Genere;
        this.pg = PG;
        this.or = Or;
        this.voti = new Hashtable<>();

        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i] == null) {
                prodotti[i] = this;
                break;
            }
        }
    }

    private static ProdottoInCatalogo [] prodotti = new ProdottoInCatalogo[9];

    private String titolo;

    public String getTitolo() {
        return titolo;
    }

    private genere genere;

    private int anno;

    private parentalGuidance pg;

    private originale or;

    private String [] cast; //fare array di oggetti Attore[]

    public enum genere {
        ANIMAZIONE,
        AZIONE,
        COMMEDIA,
        DRAMMATICO,
        FANTASCIENZA,
        FANTASY,
        GUERRA,
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

    private Hashtable<Utente, Integer> voti;

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

    public ProdottoInCatalogo.genere getGenere() {
        //System.out.println(genere);
        return genere;
    }

    public String[] generiUguali(){
        String[] generi = new String[6];
        int counter = 0;
        for (int i =0; i<6; i++){
            if(prodotti[i]!=null && this.genere.equals(prodotti[i].getGenere())){
                generi[counter] = prodotti[i].getTitolo();
                counter++;
            }
        }

        for(int i = 0; i <counter; i++){
            System.out.println(generi[i]);
        }
        return generi;
    }
}
