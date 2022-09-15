import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Es_4 {
    public static void main(String[] args) {

        int[] array = new int[5];

        Scanner input;
        int n = 0;
        input = new Scanner(System.in);
        System.out.println("Inserisci posizione:");
        try {
            n = input.nextInt();
        }catch (InputMismatchException ime){
                System.out.println("Input non valido");
        }

        input = new Scanner(System.in);
        System.out.println("Inserisci numero:");
        int i = 0;
        try{
            i = input.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("Input non valido");
        }

        try {
            array[n] = i;
        }catch (ArrayIndexOutOfBoundsException aioob){
            System.out.println("Fuori dall'array");
        }

        System.out.println(Arrays.toString(array));
    }
}
