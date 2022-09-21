public class Feedback {
    private String id;
    private String titolo;
    private String testo;
    private Feedback.punteggio val;
    public enum punteggio { UNO, DUE, TRE, QUATTRO, CINQUE }

    public Feedback(String id, String titolo, String testo, punteggio val) {
        this.id = id;
        this.titolo = titolo;
        this.testo = testo;
        this.val = val;
    }
}
