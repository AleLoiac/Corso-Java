//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Inserisci frase:");
//        String a = input.nextLine();
//
//        System.out.println("Inserisci carattere:");
//        char c = input.next().charAt(0);
//
//        int conteggio = 0;
//        for (int i = 0; i < a.length(); i++ ){
//            if(a.charAt(i)==c){
//                conteggio++;
//            }
//        }
//        System.out.println(conteggio);
//    }
//}

import java.util.Scanner;

public class ContaOccorrenze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        countOccurrences(a.charAt(0), b);
    }

    static void countOccurrences(char a, String b) {
        int conteggio = 0;
        for (int i = 0; i < b.length(); i++ ){
            if(b.charAt(i)==a){
                conteggio++;
            }
        }
        System.out.println(conteggio);
    }
}
