public class Autocarro extends Veicoli{

    private int capacità;

    public Autocarro(String targa, int numPosti, int capacità) {
        super(targa, numPosti);
        this.capacità = capacità;
    }

    public String getCapacità() {
        return this.capacità + " : " + super.getTarga();
    }
}
