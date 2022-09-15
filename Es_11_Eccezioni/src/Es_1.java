public class Es_1 {
    public static void main(String[] args) {

        int[] array = null;
        try {
            array[0] = 1;
        } catch (NullPointerException npe) {
            System.out.println("Fuori dai limiti dell'array");
        }

    }
}
