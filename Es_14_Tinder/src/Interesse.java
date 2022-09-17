public class Interesse {
    private String codice;
    private String testo;

    public Interesse(String codice, String testo) {
        this.codice = codice;
        this.testo = testo;
    }

    @Override
    public String toString() {
        return getCodice();
    }

    public String getCodice() {return codice;}
    public String getTesto() {return testo;}
    public void setTesto(String testo) {this.testo = testo;}
}
