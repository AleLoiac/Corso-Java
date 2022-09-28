public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String indirizzo;
    private String telefono;

    public Utente(String nome, String cognome, String email, String indirizzo, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    //Getters
    public String getNome() {return nome;}
    public String getCognome() {return cognome;}
    public String getEmail() {return email;}
    public String getIndirizzo() {return indirizzo;}
    public String getTelefono() {return telefono;}

}
