import java.util.PriorityQueue;
import java.util.Queue;

public class Main_Supermercato {
    public static void main(String[] args) {

        Supermercato Iper = new Supermercato("Iper");

        Cliente Mario = new Cliente("Mario");
        Cliente Gianni = new Cliente("Gianni");
        Cliente Pino = new Cliente("Pino");

        Iper.addToCoda(Gianni);
        Iper.addToCoda(Pino);
        Iper.addToCoda(Mario);
        Iper.removeFromCoda(Pino);

        Supermercato Conad = new Supermercato("Iper");

        Conad.addToCoda(Pino);

        Iper.printCoda();
        Conad.printCoda();
    }
}
