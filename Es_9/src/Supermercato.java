import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Supermercato {

    public Supermercato(String nome) {
        this.nome = nome;
        this.codaSupermercato = new PriorityQueue<>(new ComparatorClienti());
    }

    private String nome;

    private Queue<Cliente> codaSupermercato;

    public void addToCoda (Cliente cliente){
        codaSupermercato.add(cliente);
    }

    public void removeFromCoda (Cliente cliente){
        codaSupermercato.remove(cliente);
    }

    public void printCoda (){
        System.out.print("Coda " + this.nome+ ": ");
        for (Cliente cliente : codaSupermercato) {
            System.out.print(cliente.getNome() + " ");
            System.out.print("("+cliente.getEta() + ") ");
        }
        System.out.println("");
    }

    public void serviCliente (){
        System.out.println("Servo "+codaSupermercato.poll().getNome());
    }

    public void nextCliente (){
        System.out.print("Prossimo cliente " + this.nome+ ": ");
        System.out.println(codaSupermercato.peek().getNome());
    }

    public void count (){
        System.out.print("Numero clienti " + this.nome+ ": ");
        System.out.println(codaSupermercato.size());
    }

    public class ComparatorClienti implements Comparator<Cliente> {

        public int compare (Cliente s1, Cliente s2) {
            if (s1.getEta() < s2.getEta())
                return 1;
            else if (s1.getEta() > s2.getEta())
                return -1;
            return 0;
        }
    }
}
