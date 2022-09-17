import java.util.Random;
import java.util.Scanner;

public class Es_3
{
    public static void main(String args[])
    {
        int numeroFacce = 6;
        System.out.println(lanciaDado(numeroFacce));
    }

    private static int lanciaDado(int numeroFacce)
    {
        Random rand = new Random();
        int n = 1 + rand.nextInt(numeroFacce);
        return n;
    }
}