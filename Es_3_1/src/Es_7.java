import java.util.Scanner;
import java.util.Arrays;

public class Es_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        anagrams(a, b);
    }

    //static void anagrams(String a, String b) {
    //    String [] alpha = a.split("");
    //    String [] beta = a.split("");
    //    out:
    //    for (int i = 0; i < alpha.length; i++){
    //    for (int j = 0; j < beta.length; j++){
    //        if (alpha[i] == beta[j]){
    //            break;
    //        }
    //        else {
    //            System.out.println("Non Anagrammi");
    //            break out;
    //        }
    //    }
    //    }
    //}
    private static void anagrams(String a, String b) {
        String [] alpha = a.split("");
        String [] beta = b.split("");

        if(a.length()!=b.length()){
            System.out.println("Non anagrammi");
            return;
        }

        boolean found = false;
        for (int i = 0; i < alpha.length; i++){
            System.out.println(alpha[i]);
            for (int j = 0; j < beta.length; j++){
                if (alpha[i].equalsIgnoreCase(beta[j])){
                    found = true;
                    beta[j] = "";
                    break;
                }
            }

            if (!found) {
                System.out.println("Non anagrammi");
                return;
            }else{
                //Reset il valore di boolean
                found = false;
            }
        }
        System.out.println("Anagrammi");
    }

}

//Usando sort

    //String alpha = a.toLowerCase();
    //String beta = b.toLowerCase();
    //    if(alpha.length() != beta.length()){
    //            System.out.println("Non sono anagrammi");
    //            return;
    //            } else if (alpha.length() == beta.length()) {
    //            // trasformo le stringhe in array char
    //            char[] x = alpha.toCharArray();
    //            char[] y = beta.toCharArray();
    //            System.out.println(Arrays.toString(x));
    //            System.out.println(Arrays.toString(y));
    //            //ordino gli array , se sono anagrammi dopo essere stati ordinati saranno uguali
    //    /* Oltre a restituire l'array ordinato, il metodo
    //    sort () cambia le posizioni degli elementi nell'array originale.
    //    Per impostazione predefinita, il metodo sort () ordina gli elementi dell'array in ordine crescente
    //    con il valore più piccolo per primo e il valore più grande per ultimo.
    //     */
    //            Arrays.sort(x);
    //            Arrays.sort(y);
//
    //            if(Arrays.equals(x,y) == true){
    //            System.out.println("Sono anagrammi");
