import java.time.LocalDateTime;

public class Rappresentazione {
    private LocalDateTime orarioInizio;
    private String luogo;
    private double prezzo;
    private int id;
    private int idOpera;
    private String nomeSala;

    public Rappresentazione(LocalDateTime orarioInizio, String luogo, double prezzo, int id, int idOpera, String nomeSala) {
        this.orarioInizio = orarioInizio;
        this.luogo = luogo;
        this.prezzo = prezzo;
        this.id = id;
        this.idOpera = idOpera;
        this.nomeSala = nomeSala;
    }

    //Getters
    public LocalDateTime getOrarioInizio() {return orarioInizio;}
    public String getLuogo() {return luogo;}
    public double getPrezzo() {return prezzo;}
    public int getId() {return id;}
    public int getIdOpera() {return idOpera;}
    public String getNomeSala() {return nomeSala;}

}
