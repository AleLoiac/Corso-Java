public class Cliente {

    public Cliente(String nome, String cognome, int id, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
        this.eta = eta;
    }
    private String nome;

    private String cognome;

    private int id;

    private int eta;

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

}
