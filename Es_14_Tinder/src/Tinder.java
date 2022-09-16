import java.util.HashMap;
import java.util.HashSet;

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
        HashSet<Interesse> temp = new HashSet<>();
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

    public int pointsMatch (Utente utente1, Utente utente2){
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

    public Utente bestMatch (Utente utente){
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

    public void stampaTinder (){ System.out.println(sistema); }
}
