import java.util.Scanner;

public class Main1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numero:");
        int x = input.nextInt();
        int y = x % 2;
        if (y == 0)
        {
            System.out.println("Vero");
        }
        else
        {
            System.out.println("Falso");
        }
        //System.out.println((y % 2) == 0);
    }
}
