import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Es_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int indice;

        System.out.println("Grandezza array:");
        indice = sc.nextInt();
        sc.nextLine();
        String[] array = new String[indice];

        for (int i = 0; i < indice; i++) {

            System.out.println("Nome all'indice numero " + i + ":");

            //Assegna il numero inserito alla posizione in indice
            array[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
        String random = (array[new Random().nextInt(array.length)]);
        System.out.println(random);

        //Random gaussiano
        String rand = (array[1 + (int) new Random().nextGaussian()]);
        System.out.println(rand);



        //Multiple extractions. Print with percentage
//        Scanner scanner = new Scanner(System.in);
//        int extractionLimit = scanner.nextInt();
//        scanner.nextLine();
//
//        int counter = 0;
//        System.out.println("Enter number of extractions: ");
//        double[] extractions = new double[string.length];
//        while(counter < extractionLimit){
//            choice = rand.nextInt()%string.length;
//            choice = (choice < 0) ? choice*(-1) : choice;
//            extractions[choice] += 1;
//
//            counter++;
//        }
//
//        for(int i = 0; i < string.length; i++){
//            double percentage = (extractions[i]/extractionLimit)*100;
//            System.out.println( string[i] + " viene estratto il " + percentage + "% delle volte");
//        }
//        System.out.println(Arrays.toString(extractions));
//        System.out.println(Arrays.toString(string));

    }
}
