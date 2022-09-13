import java.util.PriorityQueue;
import java.util.Queue;

public class Supermercato {

    public Supermercato(String nome) {
        this.nome = nome;
        this.codaSupermercato = new PriorityQueue<>();
    }

    private String nome;

    private Queue<String> codaSupermercato;

    public void addToCoda (Cliente cliente){
        codaSupermercato.add(cliente.getNome());
    }

    public void removeFromCoda (Cliente cliente){
        codaSupermercato.remove(cliente.getNome());
    }

    public void printCoda (){
        for (String Cliente : codaSupermercato) {
            System.out.println(Cliente);
        }
    }

    //brutto
    public void nextCliente (){
        for (String Cliente : codaSupermercato) {
            System.out.println(Cliente);
            break;
        }
    }

}
