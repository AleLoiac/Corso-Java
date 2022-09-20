public class Feedback {
    private String id;
    private String titolo;
    private String testo;
    public enum punteggio { UNO, DUE, TRE, QUATTRO, CINQUE }

    public Feedback(String id, String titolo, String testo) {
        this.id = id;
        this.titolo = titolo;
        this.testo = testo;
    }
}
