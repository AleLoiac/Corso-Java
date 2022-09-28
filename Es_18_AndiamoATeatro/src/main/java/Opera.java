import java.time.Duration;

public class Opera {
    private int id;
    private String nome;
    private Duration durata;
    private Genere genere;
    public enum Genere {TRAGEDIA, COMMEDIA, OPERA_LIRICA};

    public Opera(int id, String nome, Duration durata, Genere genere) {
        this.id = id;
        this.nome = nome;
        this.durata = durata;
        this.genere = genere;
    }

    //Getters
    public int getId() {return id;}
    public String getNome() {return nome;}
    public Duration getDurata() {return durata;}
    public Genere getGenere() {return genere;}
}
