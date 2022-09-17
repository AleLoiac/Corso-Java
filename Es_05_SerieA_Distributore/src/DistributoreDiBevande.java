import java.util.Arrays;

public class DistributoreDiBevande {

    public DistributoreDiBevande (int numeroBevande){
        this.numeroBevande = numeroBevande;
        prodotti = new Prodotto [numeroBevande];
    }

    private int numeroBevande;

    private Prodotto [] prodotti;

    private double importo;

    public void caricaProdotto (Prodotto prodotto){
        for (int i = 0; i < prodotti.length; i++){
            if (prodotti[i] == null){
                prodotti[i] = prodotto;
                break;
            }
        }
    }

    public void inserisciImporto (double importo){
        this.importo += importo;
        //this.importo = importo + this.importo;
    }

    public void getProdotti (){
        System.out.println(Arrays.toString(prodotti));
    }


    public Prodotto scegliProdotto(String x){
        Prodotto temp = null;
        for (int i = 0; i < prodotti.length; i++){
            if(prodotti[i] != null){
                if( prodotti[i].getPrezzo() > this.importo){
                    return null;
                }
                if((prodotti[i].getCodice()).equals(x)){
                    if( prodotti[i].getPrezzo() > this.importo){
                        return null;
                    }
                    temp = prodotti[i];
                    this.importo -= prodotti[i].getPrezzo();

                    prodotti[i]=null;
                    break;
                }
            }
        }
        return temp;
    }


    public double saldoAttuale (){
        return importo;
    }

    public double getResto (){
        double temp = importo;
        importo = 0;
        return temp;
    }

}
