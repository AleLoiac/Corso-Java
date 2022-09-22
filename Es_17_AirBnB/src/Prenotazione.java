import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prenotazione {
    private String id;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Abitazione nomeAbitazione;
    private Utente nomeUtente;

    public Prenotazione(String id, LocalDate dataInizio, LocalDate dataFine, Abitazione nomeAbitazione, Utente nomeUtente) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.nomeAbitazione = nomeAbitazione;
        this.nomeUtente = nomeUtente;
    }
    public LocalDate getDataInizio() {return dataInizio;}
    public Abitazione getNomeAbitazione() {return nomeAbitazione;}

    @Override
    public String toString() {
        return id;
    }

    public long durataPrenotazione (){
        long durata = ChronoUnit.DAYS.between(dataInizio, dataFine);
        return durata;
    }
}
