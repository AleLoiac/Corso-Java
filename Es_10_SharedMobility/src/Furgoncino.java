public class Furgoncino extends Veicoli_Immatricolati{
    private patenteRichiesta patente;
    public Furgoncino(String ID, double prezzo, String targa) {
        super(ID, prezzo, targa);
        this.patente = patenteRichiesta.B;
    }
    //getters
    public patenteRichiesta getPatente() {return patente;}
}
