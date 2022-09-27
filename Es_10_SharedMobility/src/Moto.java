public class Moto extends Veicoli_Immatricolati{
    private Veicoli_Immatricolati.patenteRichiesta patente;
    public Moto(String ID, double prezzo, String targa) {
        super(ID, prezzo, targa);
        this.patente = Veicoli_Immatricolati.patenteRichiesta.B;
    }
    //getters
    public Veicoli_Immatricolati.patenteRichiesta getPatente() {return patente;}
}
