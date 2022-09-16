import java.util.*;

public class Dizionario {
    private String nome;
    private TreeMap<Character, HashMap<String, HashSet<String>>> dizionario = new TreeMap<>();


    public Dizionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public TreeMap<Character, HashMap<String, HashSet<String>>> getDizionario() {return dizionario;}


    public void addParola(Character lettera, String parola, String significato){
        HashMap<String, HashSet<String>> parole = new HashMap<>();
        HashSet<String> significati = new HashSet<>();
        parola = parola.toLowerCase();
        significato = significato.toLowerCase();
        if (!dizionario.containsKey(lettera)) {
            significati.add(significato);
            parole.put(parola, significati);
            dizionario.put(lettera, parole);
        }
        else if (dizionario.containsKey(lettera)) {
            parole = dizionario.get(lettera);
            if (parole.containsKey(parola)) {
                significati = parole.get(parola);
                significati.add(significato);
                parole.put(parola, significati);
                dizionario.put(lettera, parole);
            }
            else{
                significati.add(significato);
                parole.put(parola, significati);
                dizionario.put(lettera, parole);
            }
        }
    }

    public void stampa(){
        System.out.println(dizionario);
    }

    public void stampaParola(Character c, String parola){
        if (dizionario.containsKey(c) && (dizionario.get(c).containsKey(parola))){
            System.out.println(parola+"="+dizionario.get(c).get(parola));
        }
    }

    public void stampaCarattere(Character c){
        if (dizionario.containsKey(c)){
            System.out.println(dizionario.get(c));
        }
    }

}
