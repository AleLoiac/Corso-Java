import java.util.Arrays;
import java.util.Scanner;

public class Es_4 {
    public static void main(String[] args) {

        int[] array = new int[5];

        Scanner input;
        int n = 0;
        input = new Scanner(System.in);
        System.out.println("Inserisci posizione:");
        n = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Inserisci numero:");
        int i = input.nextInt();

        try {
            array[n] = i;
        }catch (Exception e){
            System.out.println("Fuori dall'array");
        }

        System.out.println(Arrays.toString(array));
    }
}
