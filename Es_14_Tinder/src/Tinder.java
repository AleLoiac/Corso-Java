import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Tinder {
    private HashMap<Utente, HashSet<Interesse>> sistema = new HashMap<>();

    public Tinder() {
    }

    public void addUtente (Utente utente, Interesse interesse){
        HashSet<Interesse> interessi = new HashSet<>();
        interessi.add(interesse);
        sistema.put(utente, interessi);
    }

    public void addInteresse (Utente utente, Interesse interesse){
        HashSet<Interesse> temp;
        if (sistema.containsKey(utente)){
            temp = sistema.get(utente);
            temp.add(interesse);
            sistema.put(utente, temp);
        }
        else{
            System.out.println("Utente non presente");
        }
    }

    public void removeUtente (Utente utente){
        sistema.remove(utente);
    }

    public int pointsMatch (Utente utente1, Utente utente2)throws UserNotFound{
        if(!sistema.containsKey(utente1))throw new UserNotFound();
        if(!sistema.containsKey(utente2))throw new UserNotFound();
        HashSet<Interesse> utente1temp = sistema.get(utente1);
        HashSet<Interesse> utente2temp = sistema.get(utente2);
        int points = 0;
        for (Interesse i: utente1temp){
            if(utente2temp.contains(i)){
                points++;
            }
        }
        return points;
    }

    public Utente bestMatch (Utente utente) throws UserNotFound {
        if(!sistema.containsKey(utente))throw new UserNotFound();
        int punti = 0;
        Utente x = null;
        for (Utente u : sistema.keySet()){
            if (u.equals(utente)){
                continue;
            }
            if (pointsMatch(utente, u) > punti){
                punti = pointsMatch(utente, u);
                x = u;
            }
        }
        return x;
    }

    public int punti (Utente utente) throws UserNotFound {
        if(!sistema.containsKey(utente))throw new UserNotFound();
        int punti = 0;
        for (Utente u : sistema.keySet()){
            if (u.equals(utente)){
                continue;
            }
            if (pointsMatch(utente, u) > punti){
                punti = pointsMatch(utente, u);
            }
        }
        return punti;
    }

    public Object topMatch () throws UserNotFound {
        TreeMap<Integer, HashSet<String>> classifica = new TreeMap<>();
        HashSet<String> utenti = new HashSet<>();
        for (Utente u : sistema.keySet()){
            utenti.add(u.getNome());
            utenti.add(bestMatch(u).getNome());
            classifica.put(punti(u), utenti);
            utenti = new HashSet<>();
        }
        return classifica.get(classifica.lastKey());
    }

    public void stampaTinder (){
        for (Utente u: sistema.keySet()) {
            System.out.print(u.getNome()+" ");
            System.out.println(sistema.get(u));
        }
    }
}
