public class Main_Dizionario {
    public static void main(String[] args) {

        Dizionario zanichelli = new Dizionario("Zanichelli");

        Parola abaco = new Parola("Abaco");

        Significato significatoAbaco = new Significato("Antico pallottoliere o altro primitivo strumento per far di conto.");

        zanichelli.addParola(abaco, significatoAbaco);

    }
}
