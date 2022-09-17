import java.util.Arrays;
import java.util.Scanner;

public class Es_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();

        System.out.println("m:");
        int m = sc.nextInt();

        int[] arrayCreato = new int[m];

        for (int i = 0; i < arrayCreato.length; i++) {
            arrayCreato[i] = i * n;
            }

        // così esclude lo 0

        //for (int i = 1; i <= arrayCreato.length; i++) {
        //    arrayCreato[i-1] = i * n;
        //}

        System.out.println(Arrays.toString(arrayCreato));
    }
}
