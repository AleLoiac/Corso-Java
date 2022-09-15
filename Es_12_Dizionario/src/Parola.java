import java.util.TreeMap;

public class Parola extends TreeMap<Parola, Significato> {
    private String parola;

    public Parola(String parola) {
        this.parola = parola;
    }

    public String getParola() {return parola;}
}
