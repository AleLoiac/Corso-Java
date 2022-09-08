public class Squadra {

    public Squadra(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.rosa = new Giocatore[11];
        this.punteggio = 0;
        golFatti = 0;
        golSubiti = 0;
    }

    private int id;

    private String nome;

    private Giocatore [] rosa;

    private int punteggio;

    private int golFatti;

    private int golSubiti;

    public void addGiocatore(Giocatore giocatore) {
        for (int i = 0; i < rosa.length; i++){
            if (rosa[i] == null){
                rosa[i] = giocatore;
                break;
            }
        }
    }

    public int addPunteggio(int aggiungiPunti){
        int temp = 0;
        temp =+ aggiungiPunti;
        punteggio = punteggio + temp;
        return punteggio;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public int addGol(int gol){
        golFatti += gol;
        return golFatti;
    }

    public int getGolFatti() {
        return golFatti;
    }

    public int addGolSub(int gol){
        golSubiti += gol;
        return golSubiti;
    }
    public int getGolSubiti() {
        return golSubiti;
    }

    public String getNome() {
        return nome;
    }

}

