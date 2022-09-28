public class Sala {
    private String nome;
    private int numeroPosti;
    private String indirizzoSede;

    public Sala(String nome, int numeroPosti, String indirizzoSede) {
        this.nome = nome;
        this.numeroPosti = numeroPosti;
        this.indirizzoSede = indirizzoSede;
    }

    //Getters
    public String getNome() {return nome;}
    public int getNumeroPosti() {return numeroPosti;}
    public String getIndirizzoSede() {return indirizzoSede;}
}
