public class Interruttore {
    private Lampadina lampadina;

    public Interruttore(Lampadina lampadina) {
        this.lampadina = lampadina;
    }

    public void click(int click){
        lampadina.click(click);
        System.out.println("Stato:" + lampadina.stato());

    }
}
