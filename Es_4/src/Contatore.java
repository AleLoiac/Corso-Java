import java.util.Scanner;

public class Contatore {

    //costruttore per istanziare con int iniziale
    public Contatore(int conteggioAttuale) {
        this.conteggioAttuale = conteggioAttuale;
    }

    //costruttore per istanziare senza nulla
    public Contatore() {
    }

    private int conteggioAttuale;

    public void setValIniziale(int valIniziale) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Valore iniziale:");
        //int n = sc.nextInt();
        this.conteggioAttuale = valIniziale;
    }

    public int getConteggioAttuale() {
        return conteggioAttuale;
    }

    public void incrConteggio() {
        conteggioAttuale++;
    }

    public void resetConteggio() {
        this.conteggioAttuale = 0;
    }

    public boolean setConteggio(int nuovoConteggio) {
        if (nuovoConteggio < 0)
            return false;

        conteggioAttuale = nuovoConteggio;
        return true;
    }
}
