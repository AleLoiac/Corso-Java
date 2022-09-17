import java.util.Scanner;

public class Profilo {

    public Profilo(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    private String nome;

    private String password;

    private int tipoDiOfferta;

    private Utente [] utenti;

    public int getTipoDiOfferta() {
        return tipoDiOfferta;
    }

    public void setTipoDiOfferta(int tipoDiOfferta) {
        this.tipoDiOfferta = tipoDiOfferta;
    }

    public Utente[] getUtenti() {
        return utenti;
    }

    public boolean chiediPassword(String n){
        boolean accesso = false;
        if (n.equals(password)){
            accesso = true;
        }
        else accesso = false;
        return accesso;
    }

    public void cambiaTipoUtente (Utente nuovoTipoUtente, String passwordInserita){
        if (chiediPassword(passwordInserita) == true){
            nuovoTipoUtente.changeTipoUtente();
        }
    }

    public String getNome() {
        return nome;
    }
}
