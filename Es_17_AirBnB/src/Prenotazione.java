public class Prenotazione {
    private String id;
    private String dataInizio;
    private String dataFine;
    private Abitazione nomeAbitazione;
    private Utente nomeUtente;

    public Prenotazione(String id, String dataInizio, String dataFine, Abitazione nomeAbitazione, Utente nomeUtente) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.nomeAbitazione = nomeAbitazione;
        this.nomeUtente = nomeUtente;
    }

    @Override
    public String toString() {
        return id;
    }
}
