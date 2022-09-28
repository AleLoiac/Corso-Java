public abstract class Sede {
private String nome;
private String indirizzo;
private String comune;
private boolean isChiuso;

    public Sede(String nome, String indirizzo, String comune, boolean isChiuso) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.comune = comune;
        this.isChiuso = isChiuso;
    }

    //Getters
    public String getNome() {return nome;}
    public String getIndirizzo() {return indirizzo;}
    public String getComune() {return comune;}
    public boolean isChiuso() {return isChiuso;}
}
