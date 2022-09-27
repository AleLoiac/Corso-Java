public class Automobile extends Veicoli_Immatricolati{
    private patenteRichiesta patente;
    public Automobile(String ID, double prezzo, String targa) {
        super(ID, prezzo, targa);
        this.patente = patenteRichiesta.B;
    }
    //getters
    public patenteRichiesta getPatente() {return patente;}
}
