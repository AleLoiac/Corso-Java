import java.util.Random;
import java.util.Scanner;

public class Es_3 {
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
            }catch (ArithmeticException a){
                System.out.println("E' uscito 0, aggiungo 1");
                randomInt+=1;
            }
            divisione = n / randomInt;
        } catch (Exception f) {
            System.out.println("Mismatch :"+f);
        } finally {
            System.out.println(divisione);
        }

    }
}
