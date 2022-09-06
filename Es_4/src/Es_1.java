public class Es_1 {
    public static void main(String[] args) {
        Contatore contatore = new Contatore();
        contatore.incrConteggio();
        contatore.incrConteggio();
        System.out.println(contatore.getConteggioAttuale());
        contatore.resetConteggio();
        System.out.println(contatore.getConteggioAttuale());
        contatore.setConteggio(18);
        System.out.println(contatore.getConteggioAttuale());
    }

}
