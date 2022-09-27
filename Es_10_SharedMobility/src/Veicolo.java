public abstract class Veicolo {
    private String ID;
    private boolean disponibile;
    private String posGeografica;
    private double prezzo;

    public Veicolo(String ID, double prezzo) {
        this.ID = ID;
        this.disponibile = true;
        this.posGeografica = "Autorimessa"; /*linked list*/
        this.prezzo = prezzo;
    }
    //getters
    public String getID() {return ID;}
    public boolean isDisponibile() {return disponibile;}
    public String getPosGeografica() {return posGeografica;}
    public double getPrezzo() {return prezzo;}
    //setters
    public void setDisponibile() {this.disponibile = true ? false : true;}
    public void setPosGeografica(String posGeografica) {this.posGeografica = posGeografica;}
}
