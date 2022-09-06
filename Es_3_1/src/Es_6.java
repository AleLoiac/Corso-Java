import java.util.Arrays;
import java.util.Scanner;

public class Es_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        String[] numeri = s.split(",");
        int[] values = new int[numeri.length];
        for(int i=0; i< numeri.length; i++) {
            values[i] = Integer.parseInt(numeri[i]);
        }
        return values;
    }

    static void computeMinAndMax(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println(min+","+max);
    }
}

