import java.util.Scanner;

public class Main1_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci frase:");
        String x = input.nextLine();
        //System.out.println(x);
        String[] s = x.split(" ");
        String s1 = s[1] + " " + s[0];
        System.out.println(s1);
    }
}
