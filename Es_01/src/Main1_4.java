import java.util.Scanner;

public class Main1_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci a:");
        String a = input.nextLine();

        System.out.println("Inserisci b:");
        String b = input.nextLine();

        System.out.println("Inserisci frase c:");
        String c = input.nextLine();

        String[] x = c.split(" ");
        String centrale = x[1].replace(a, b);
        System.out.println(x[0] + " " + centrale + " " + x[2]);
    }
}
