public class Monopattino extends Veicolo{
    public enum livelloCarica {SCARICO, META, CARICO}
    private livelloCarica batteria;
    public Monopattino(String ID, double prezzo) {
        super(ID, prezzo);
        this.batteria = livelloCarica.CARICO;
    }
}
