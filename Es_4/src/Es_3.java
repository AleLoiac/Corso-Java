public class Es_3 {
    public static void main(String[] args) {
        Lampadina lampadina = new Lampadina();
        System.out.println(lampadina.stato());
        //lampadina.click(9);
        //System.out.println(lampadina.stato());
        Interruttore interruttore1 = new Interruttore(lampadina);
        interruttore1.click(1);
        Interruttore interruttore2 = new Interruttore(lampadina);
        interruttore2.click(1);
        lampadina.setCorrente(1);
        //System.out.println(lampadina.getCorrente());
    }
}
