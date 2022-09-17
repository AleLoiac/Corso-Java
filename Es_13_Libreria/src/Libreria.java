import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Libreria {
    private String nome;
    private HashMap<String, Libro> libreria = new HashMap<>();

    public Libreria(String nome) {
        this.nome = nome;
    }

    public String getNome() {return nome;}

    public void addLibro (Libro libro){
        libreria.put(libro.getCodiceLibro(), libro);
    }

    public void removeLibro (Libro libro){
        libreria.remove(libro.getCodiceLibro(), libro);
    }

    public void stampaLibreria(){
        System.out.println(libreria);
    }

    public void cercaLibroPerCodice (String codice) throws LibroNonTrovato{
        if (!libreria.containsKey(codice)) throw new LibroNonTrovato();
        if (libreria.containsKey(codice)){
            System.out.println(libreria.get(codice).getTitolo());
        }
    }

    public void cercaLibroPerTitolo (String titolo) throws LibroNonTrovato{
        for (Libro libro : libreria.values()) {
            if (libro.getTitolo().equals(titolo)){
                System.out.println("Codice libro: "+libro.getCodiceLibro());
                break;
            }
            else{
                throw new LibroNonTrovato();
            }
        }
    }

    public void cercaLibroPerAutore (Autore autore){
        for (Libro libro : libreria.values()) {
            if (libro.getAutore().equals(autore)){
                System.out.print(libro.getTitolo()+", ");
            }
            else{
                System.out.println("Autore non trovato");
            }
        }
        System.out.println("");
    }

    public void stampaPerAutore (Autore autore) {
        Queue<Libro> codaLibri = new PriorityQueue<>();
        for (Libro libro : libreria.values()) {
            if (libro.getAutore().equals(autore)) {
                codaLibri.add(libro);
            } else {
                System.out.println("Autore non trovato");
            }
        }
        for (Libro libro : codaLibri) {
            {
                System.out.print(libro.getTitolo()+": "+libro.getSinossi()+"\n");
            }
        }
    }
}
