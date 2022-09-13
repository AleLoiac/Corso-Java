import java.util.Arrays;
import java.util.Hashtable;

public class Utente extends Profilo {

    public Utente(String nome, String password, int pin) {
        super(nome, password);
        this.tipo = tipoUtente.NORMALE;
        this.pin = pin;
        this.myList = new ProdottoInCatalogo[5];
        this.map = new Hashtable<ProdottoInCatalogo, Integer>();
    }

    private String nome;
    private tipoUtente tipo;
    private int pin;

    private ProdottoInCatalogo[] prodotti;

    public enum Avatar {
        GATTO,
        CONIGLIO,
        PESCE_ROSSO
    }

    public enum tipoUtente {
        NORMALE,
        KID
    }
    public tipoUtente getTipo() {
        return tipo;
    }

    public void changeTipoUtente() {
        if (this.tipo.equals(tipoUtente.NORMALE)) {
            tipo = tipoUtente.KID;
        } else {
            tipo = tipoUtente.NORMALE;
        }
    }

    public void changePin(int newPin, String passwordInserita) {
        if (chiediPassword(passwordInserita)) {
            pin = newPin;
            System.out.println("Pin aggiornato " + pin);
        } else {
            System.out.println("Password Errata");
        }
    }

    private ProdottoInCatalogo[] myList;

    public ProdottoInCatalogo[] addProdotto(ProdottoInCatalogo prodotto) {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] == null) {
                myList[i] = prodotto;
                break;
            }
        }
        return myList;
    }

    public String[] stampaLista() {
        System.out.print("Lista di " + this.getNome() + " ");
        int n = 0;
        for (int j = 0; j < myList.length; j++) {
            if (myList[j] != null) {
                n++;
            }
        }
        String[] list = new String[n];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] != null) {
                list[i] = myList[i].getTitolo();
            }
        }
        return list;
    }

    Hashtable<ProdottoInCatalogo, Integer> map;

    public void assegnaVoto(ProdottoInCatalogo prod, int i){
        if (i > 0 && i <= 5 && prod!=null){
            map.put(prod, i);
            prod.assegnaVotoUtente(this, i);
        }
    }

    public void printValutazioni(){
        for(ProdottoInCatalogo prod : map.keySet()){
            System.out.println(prod.getTitolo() + " Valutazione: " + map.get(prod));
        }
    }

    public void consigli (){
        for (int i = 0; i < myList.length; i++){
            if (myList[i] != null && (myList[i].getVoto(this) > 3)){
                myList[i].genereConsiglio();
            }
            if (myList[i] != null) {
                System.out.println(" ");
            }
            else break;
        }
    }
}
