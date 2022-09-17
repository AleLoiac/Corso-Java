public class Main_Libreria {
    public static void main(String[] args) {
        Libreria BibliotecaDiAlessandria = new Libreria("Biblioteca Di Alessandria");
        Autore ValerioMassimo = new Autore("VM", "Valerio", "Massimo");
        Libro LoScudoDiTalos = new Libro("1", "Lo Scudo Di Talos", "Romanzo storico", ValerioMassimo);
        Libro Alexandros = new Libro("2", "Alexandros", "Saggio sulla guerra", ValerioMassimo);
        Libro IlMioNomeENessuno = new Libro("3", "Il Mio Nome E' Nessuno", "Romanzo Grecia antica", ValerioMassimo);

        BibliotecaDiAlessandria.addLibro(LoScudoDiTalos);
        BibliotecaDiAlessandria.addLibro(Alexandros);
        BibliotecaDiAlessandria.addLibro(IlMioNomeENessuno);

        BibliotecaDiAlessandria.stampaLibreria();

        BibliotecaDiAlessandria.removeLibro(LoScudoDiTalos);

        BibliotecaDiAlessandria.stampaLibreria();

        try {
            BibliotecaDiAlessandria.cercaLibroPerCodice("3");
        }catch (LibroNonTrovato lnt){
            System.out.println(lnt.getMessage());
        }
        try {
            BibliotecaDiAlessandria.cercaLibroPerCodice("4");
        }catch (LibroNonTrovato lnt){
            System.out.println(lnt.getMessage());
        }

        try {
            BibliotecaDiAlessandria.cercaLibroPerTitolo("Alexandros");
        }catch (LibroNonTrovato lnt){
            System.out.println(lnt.getMessage());
        }

        try {
            BibliotecaDiAlessandria.cercaLibroPerTitolo("Baluba");
        }catch (LibroNonTrovato lnt){
            System.out.println(lnt.getMessage());
        }

        BibliotecaDiAlessandria.cercaLibroPerAutore(ValerioMassimo);

        BibliotecaDiAlessandria.stampaPerAutore(ValerioMassimo);
    }
}
