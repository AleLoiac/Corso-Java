public class Prenotazione {
    private int id;
    private int fila;
    private int numeroPosto;
    private String emailUtente;
    private int idRappresentazione;

    public Prenotazione(int id, int fila, int numeroPosto, String emailUtente, int idRappresentazione) {
        this.id = id;
        this.fila = fila;
        this.numeroPosto = numeroPosto;
        this.emailUtente = emailUtente;
        this.idRappresentazione = idRappresentazione;
    }

    //Getters
    public int getId() {return id;}
    public int getFila() {return fila;}
    public int getNumeroPosto() {return numeroPosto;}
    public String getEmailUtente() {return emailUtente;}
    public int getIdRappresentazione() {return idRappresentazione;}

}
