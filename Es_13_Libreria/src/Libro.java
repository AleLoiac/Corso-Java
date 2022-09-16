public class Libro implements Comparable{
    private String codiceLibro;
    private String titolo;
    private String sinossi;
    private Autore autore;

    public Libro (String codiceLibro, String titolo, String sinossi, Autore autore) {
        this.codiceLibro = codiceLibro;
        this.titolo = titolo;
        this.sinossi = sinossi;
        this.autore = autore;
    }

    public String getCodiceLibro() {return codiceLibro;}
    public String getTitolo() {return titolo;}
    public String getSinossi() {return sinossi;}
    public Autore getAutore() {return autore;}

    @Override
    public int compareTo(Object o) {
        Libro a1 = (Libro) o;
        String e1 = this.getTitolo();
        String e2 = a1.getTitolo();
        return e1.compareTo(e2);
    }
}
