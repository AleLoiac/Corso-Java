public class Es_1 {
    public static void main(String[] args) {

        try {
            int[] array = null; array[0] = 1;
        } catch (Exception e) {
            System.out.println("Fuori dai limiti dell'array");
        }

    }
}
