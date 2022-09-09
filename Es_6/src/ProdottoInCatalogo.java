import java.util.PropertyPermission;

public abstract class ProdottoInCatalogo {

    public ProdottoInCatalogo(String titolo, int anno, genere Genere, parentalGuidance PG, originale Or) {
        //this.prodotti = new ProdottoInCatalogo[numProdotti];
        this.titolo = titolo;
        this.anno = anno;
        this.genere = Genere;
        this.pg = PG;
        this.or = Or;
    }

    private ProdottoInCatalogo [] prodotti;

    private String titolo;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
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

}
