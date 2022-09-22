package Errori;

public class EmailNonTrovata extends Exception{
    public EmailNonTrovata() {
        super("Email non trovata");
    }
}