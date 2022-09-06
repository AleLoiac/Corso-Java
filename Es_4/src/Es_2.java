public class Es_2 {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(12);
        System.out.println(quadrato.getPerimetro());
        quadrato.printFigura();
        Cerchio cerchio = new Cerchio(3);
        System.out.println(cerchio.getCirconferenza());
        System.out.println(cerchio.getArea());
    }
}

