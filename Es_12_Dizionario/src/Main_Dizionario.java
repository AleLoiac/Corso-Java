public class Main_Dizionario {
    public static void main(String[] args) {

        Dizionario zanichelli = new Dizionario("Zanichelli");

        zanichelli.addParola('a', "abaco", "Antico pallottoliere");
        zanichelli.addParola('a', "abaco", "Giochino");
        zanichelli.addParola('b', "banana", "Frutto");
        zanichelli.addParola('b', "banana", "Unità di misura");
        zanichelli.addParola('b', "bruco", "Insetto");
        zanichelli.addParola('c', "cane", "Animale da compagnia");

        zanichelli.stampa();
        zanichelli.stampaParola('a', "abaco");
    }
}
