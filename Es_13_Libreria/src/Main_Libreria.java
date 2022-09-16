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

        BibliotecaDiAlessandria.cercaLibroPerCodice("3");
        BibliotecaDiAlessandria.cercaLibroPerCodice("4");
        BibliotecaDiAlessandria.cercaLibroPerTitolo("Alexandros");
        BibliotecaDiAlessandria.cercaLibroPerAutore(ValerioMassimo);

        BibliotecaDiAlessandria.stampaPerAutore(ValerioMassimo);
    }
}
