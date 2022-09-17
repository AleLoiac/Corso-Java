public class Prodotto {

    public Prodotto (String codice, double prezzo){
        this.codice = codice;
        this.prezzo = prezzo;
    }

    private double prezzo;

    private String codice;

    private String prodotto;

    public Prodotto() {

    }

    public String getCodice(){
        return codice;
    }

    public double getPrezzo(){
        return prezzo;
    }
}
