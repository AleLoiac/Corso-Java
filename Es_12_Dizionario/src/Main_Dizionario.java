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

        try{
            zanichelli.stampaCarattere('b');
        }catch (LetterNotPresent lnp){
            System.out.println(lnp.getMessage());
        }


        //catches su stessa riga
        try {
            zanichelli.stampaParola('b', "banana");
        }catch (WordNotPresent | LetterNotPresent wplp){
            System.out.println(wplp.getMessage());
        }

        //catches su righe differenti
        try {
            zanichelli.stampaParola('b', "gnegne");
        }catch (WordNotPresent wnp){
            System.out.println(wnp.getMessage());
        }catch (LetterNotPresent lnp){
            System.out.println(lnp.getMessage());
        }

        try{
            zanichelli.stampaCarattere('x');
        }catch (LetterNotPresent lnp){
            System.out.println(lnp.getMessage());
        }

    }
}
