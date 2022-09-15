import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Es_3 extends Exception{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int randomInt = rand.nextInt(3);

        int divisione = 0;
        try {
            System.out.println("Inserisci numero:");
            int n = input.nextInt();
            try{
                if (randomInt==0){
                    throw new ArithmeticException();
                }
            }catch (ArithmeticException ae){
                System.out.println("E' uscito 0, aggiungo 1");
                randomInt+=1;
            }
            divisione = n / randomInt;
        } catch (InputMismatchException ime) {
            System.out.println("Mismatch");
        } finally {
            System.out.println(divisione);
        }

    }
}
