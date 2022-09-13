import java.util.Scanner;

public class Main1_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci a:");
        String a = input.nextLine();
        String d = a.toUpperCase();
        //System.out.println(d);

        System.out.println("Inserisci b:");
        String b = input.nextLine();
        String e = b.toUpperCase();
        //System.out.println(e);

        System.out.println("Inserisci c:");
        String c = input.nextLine();
        String f = c.toUpperCase();
        //System.out.println(f);

        int x = 0;
        if(d.equals(e))
        {
            ++x;
        }
        if(e.equals(f))
        {
            ++x;
        }
        if(d.equals(f))
        {
            ++x;
        }
        if( x == 1)
        {
            x += 1;
        }

        System.out.println(x);
        }
}
