import java.util.Scanner;

public class Es_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numero di secondi:");
        int sec = input.nextInt();

        int minuti = sec / 60;
        System.out.println("Minuti:"+ minuti);

        int ore = sec / 3600;
        System.out.println("Ore:"+ ore);

        int giorni = sec / 86400;
        System.out.println("Giorni:"+ giorni);
    }
}

//Codice da Ionut

//    private static void secondiConverter(long secondsInput){
//        long temp = secondsInput;
//        int giorni = 0;
//        byte ore = 0;
//        byte minuti = 0;
//        byte secondi = 0;
//
//        if(temp >= 86400){
//            giorni = (int) (temp/86400);
//            temp -= (giorni*86400);
//        }
//        if(temp >= 3600){
//            ore = (byte)(temp/3600);
//            temp -= (ore*3600);
//        }
//        if(temp >= 60){
//            minuti = (byte)(temp/60);
//            temp-=(minuti*60);
//        }
//        if(temp > 0){
//            secondi = (byte)temp;
//            temp = 0;
//        }
//        System.out.println("Giorni: " + giorni + " Ore: " + ore + " Minuti: " + minuti + " Secondi: " + secondi);
//    }

