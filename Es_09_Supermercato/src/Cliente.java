public class Cliente /*implements Comparable*/{

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

    //@Override
    //public int compareTo(Object o){
    //    Cliente a1 = (Cliente) o;
    //    Integer e1 = this.eta;
    //    Integer e2 = a1.eta;
    //    return e1.compareTo(e2);
    //}

}
