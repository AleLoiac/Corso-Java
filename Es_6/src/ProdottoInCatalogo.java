public abstract class ProdottoInCatalogo {

    private String titolo;

    private int anno;

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
