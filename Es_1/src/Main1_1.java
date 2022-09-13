import java.util.Scanner;

public class Main1_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci primo numero:");
        float x = input.nextInt();
        //System.out.println(x);
        System.out.println("Inserisci secondo numero:");
        float y = input.nextInt();
        //System.out.println(y);
        float a = x + y;
        float b = x - y;
        float c = x * y;
        float d = x / y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
