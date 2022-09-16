import java.util.ArrayList;
import java.util.List;

public class Autore {
    private String codiceAutore;
    private String nome;
    private String cognome;
    private List<Libro> listaLibri = new ArrayList<>();

    public Autore(String codiceAutore, String nome, String cognome) {
        this.codiceAutore = codiceAutore;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getCodiceAutore() {return codiceAutore;}
    public String getNome() {return nome;}
    public String getCognome() {return cognome;}
    public List<Libro> getListaLibri() {return listaLibri;}


}
