import java.util.TreeMap;

public class Dizionario {
    private String nome;
    private TreeMap<Lettera, TreeMap<Parola, Significato>> dizionario = new TreeMap<>();
    private TreeMap<Parola, Significato> parole = new TreeMap<>();

    public Dizionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {return nome;}
    public TreeMap<Parola, Significato> getParole() {return parole;}
    public TreeMap<Lettera, TreeMap<Parola, Significato>> getDizionario() {return dizionario;}

    public void setNome(String nome) {this.nome = nome;}

    //public void addParola(Lettera l, Parola p, Significato s){
    //    dizionario.put(l (p, s));
    //}
}
