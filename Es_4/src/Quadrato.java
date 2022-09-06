public class Quadrato {

    public Quadrato(int lato) {
        this.lato = lato;
    }

    private int lato;

    public int getPerimetro() {
        return lato * 4;
    }

    public void printFigura() {
        System.out.print(" ");
        for (int i = 0; i < lato; i++) {
            System.out.print("_");
        }
        System.out.print("\n");
        for (int j = 0; j < lato/2; j++) {
            for (int i = 0; i < lato; i++) {
                System.out.print("|");
                for (i = 0; i < lato; i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.print("\n");
            }
        }
        System.out.print(" ");
        for (int i = 0; i < lato; i++) {
            System.out.print("_");
        }
        System.out.print("\n");
    }
}