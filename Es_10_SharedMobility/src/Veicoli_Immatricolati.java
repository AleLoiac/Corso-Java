public abstract class Veicoli_Immatricolati extends Veicolo{
    public enum livelloCarburante {PIENO,META, RISERVA}
    public enum patenteRichiesta {A,B}
    private livelloCarburante serbatoio;
    private String targa;

    public Veicoli_Immatricolati(String ID, double prezzo, String targa) {
        super(ID, prezzo);
        this.serbatoio = livelloCarburante.PIENO;
        this.targa = targa;
    }
    //getters
    public livelloCarburante getSerbatoio() {return serbatoio;}
    public String getTarga() {return targa;}
    //setters
    public void setSerbatoio(livelloCarburante serbatoio) {this.serbatoio = serbatoio;}
}
