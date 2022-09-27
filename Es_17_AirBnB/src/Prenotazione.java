import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prenotazione {
    private String id;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Abitazione abitazione;
    private Utente nomeUtente;

    public Prenotazione(String id, LocalDate dataInizio, LocalDate dataFine, Abitazione abitazione, Utente nomeUtente) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.abitazione = abitazione;
        this.nomeUtente = nomeUtente;
    }
    public LocalDate getDataInizio() {return dataInizio;}
    public Abitazione getAbitazione() {return abitazione;}
    public Utente getNomeUtente() {return nomeUtente;}

    @Override
    public String toString() {
        return id;
    }

    public long durataPrenotazione (){
        long durata = ChronoUnit.DAYS.between(dataInizio, dataFine);
        return durata;
    }
}
