public class Utente extends Profilo{

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

    private int pin;
}
