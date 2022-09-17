import java.util.Arrays;
import java.util.Scanner;

public class Es_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int indice;

        System.out.println("Grandezza array:");
        indice = sc.nextInt();

        int[] array = new int[indice];

        for (int i = 0; i < indice; i++) {

            System.out.println("Elemento all'indice numero " + i + ":");

            //Assegna il numero inserito alla posizione in indice
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 1){
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
