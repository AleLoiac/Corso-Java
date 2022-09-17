public class Automobile extends Veicoli{

    private int porte;

    public Automobile(String targa, int numPosti, int porte) {
        super(targa, numPosti);
        this.porte = porte;
    }

    public String getPorte() {
        return this.porte + " : " + super.getTarga();
    }

}
