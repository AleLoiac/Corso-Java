import java.util.Objects;

public class Lampadina {

    public Lampadina() {
        this.stato = Stato.SPENTA;
    }

    private Stato stato;
    private int clicks;
    private int corrente;

    public int getCorrente() {
        return corrente;
    }

    public void setCorrente(int corrente){
        this.corrente = corrente;
    }

    public Stato stato() {
        return stato;
    }

    public void click(int clicks){
        corrente = 1;
        if (clicks > 10){
            this.stato = Stato.ROTTA;
        }
        else {
            if (this.stato.equals(Stato.ROTTA)){
                return;
            }
            else {
                for (int i = 0; i < clicks; i++) {
                    if (this.stato.equals(Stato.ACCESA)) {
                        this.stato = Stato.SPENTA;
                        clicks++;
                    } else {
                        this.stato = Stato.ACCESA;
                        clicks++;
                    }
                }
            }
        }
        if ((corrente==0) && (stato.equals(Stato.ACCESA))){
            this.stato = Stato.SPENTA;
        }
    }

}