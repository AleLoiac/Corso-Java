public class Utente extends Profilo{

    public Utente(String nome, String password, int pin) {
        super(nome, password);
        this.tipo = tipoUtente.NORMALE;
        this.pin = pin;
        this.myList = new ProdottoInCatalogo[5];
    }

    private String nome;

    public enum Avatar{
        GATTO,
        CONIGLIO,
        PESCE_ROSSO
    }

    public enum tipoUtente {
        NORMALE,
        KID
    }

    private tipoUtente tipo;

    private int pin;

    public tipoUtente getTipo() {
        return tipo;
    }

    private ProdottoInCatalogo[] prodotti;

    public void changeTipoUtente(){
        if(this.tipo.equals(tipoUtente.NORMALE)){
            tipo = tipoUtente.KID;
        }else{
            tipo = tipoUtente.NORMALE;
        }
    }

    public void changePin(int newPin, String passwordInserita) {
        if (chiediPassword(passwordInserita)) {
            pin = newPin;
            System.out.println("Pin aggiornato " + pin);
        }
        else{
            System.out.println("Password Errata");
        }
    }

    private ProdottoInCatalogo[] myList;

    public void addProdotto(ProdottoInCatalogo prodotto){
        for(int i = 0; i < myList.length; i++){
            if (myList[i] == null){
                myList[i] = prodotto;
                break;
            }
        }
    }

    public ProdottoInCatalogo[] getMyList() {
        return myList;
    }

    public void voto(String voto){

    }
}
