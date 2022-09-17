import java.util.Arrays;

public class Biblioteca {
    public Biblioteca(int[] values) {
        this.values = values;
    }

    private int[] libriOrdinati;

    private int[] values;

    public boolean esisteLibro(int element) {
        boolean test = false;
        for (int i : values) {
            if (i == element) {
                test = true;
                break;
            }
        }
        return test;
    }

    public int[] getIndiciLibriOrdinati() {
        Arrays.sort(values);
        libriOrdinati = values;
        return libriOrdinati;
    }
}
