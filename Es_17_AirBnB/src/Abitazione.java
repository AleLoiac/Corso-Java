public class Abitazione {
    private String id;
    private String nome;
    private String indirizzo;
    private int numLocali;
    private int numLetti;
    private int piano;

    private double prezzo;
    private String periodo;

    public Abitazione(String id, String nome, String indirizzo, int numLocali, int numLetti, int piano) {
        this.id = id;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numLocali = numLocali;
        this.numLetti = numLetti;
        this.piano = piano;
    }

    public String getId() {return id;}
    public String getNome() {return nome;}
    public String getIndirizzo() {return indirizzo;}
    public int getNumLocali() {return numLocali;}
    public int getNumLetti() {return numLetti;}
    public int getPiano() {return piano;}

    @Override
    public String toString() {
        return nome;
    }
}
