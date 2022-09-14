public class Main_Supermercato {
    public static void main(String[] args) {

        Supermercato Iper = new Supermercato("Iper");

        Cliente Mario = new Cliente("Mario", "Rossi", 32, 46);
        Cliente Gianni = new Cliente("Gianni", "Fantoni", 44, 31);
        Cliente Pino = new Cliente("Pino", "Abete", 12, 56);
        Cliente Maura = new Cliente("Maura", "Picia", 76, 55);
        Cliente Alessandro = new Cliente("Alessandro", "Zuzzu", 54, 98);
        Cliente Mimma = new Cliente("Mimma", "Mummia", 30, 71);

        Iper.addToCoda(Gianni);
        Iper.addToCoda(Pino);
        Iper.addToCoda(Mario);
        Iper.removeFromCoda(Pino);
        Iper.addToCoda(Maura);
        Iper.addToCoda(Alessandro);

        Supermercato Conad = new Supermercato("Conad");

        Conad.addToCoda(Pino);
        Conad.addToCoda(Mimma);

        Iper.printCoda();
        Conad.printCoda();

        Iper.nextCliente();
        Conad.nextCliente();

        Iper.count();
        Conad.count();
    }
}
