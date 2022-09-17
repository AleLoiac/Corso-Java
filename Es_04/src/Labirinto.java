import java.util.Arrays;
import java.util.Scanner;

public class Labirinto {
    public static void main(String[] args) {
        int colonne = 5;
        int righe = 5;
        String[][] matrice = new String[righe][colonne];
        matrice[0][0] = "-";
        matrice[0][1] = "-";
        matrice[0][2] = "W";
        matrice[0][3] = "W";
        matrice[0][4] = "-";
        matrice[1][0] = "-";
        matrice[1][1] = "W";
        matrice[1][2] = "-";
        matrice[1][3] = "W";
        matrice[1][4] = "-";
        matrice[2][0] = "P";
        matrice[2][1] = "W";
        matrice[2][2] = "-";
        matrice[2][3] = "W";
        matrice[2][4] = "W";
        matrice[3][0] = "-";
        matrice[3][1] = "-";
        matrice[3][2] = "W";
        matrice[3][3] = "-";
        matrice[3][4] = "E";
        matrice[4][0] = "W";
        matrice[4][1] = "-";
        matrice[4][2] = "-";
        matrice[4][3] = "-";
        matrice[4][4] = "W";
        for (int i=0; i<5; i++) {
            System.out.println(Arrays.toString(matrice[i]));
        }

    }
}
