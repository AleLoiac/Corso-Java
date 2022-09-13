import java.util.Arrays;
import java.util.Scanner;

public class Es_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index:");
        int index =sc.nextInt();
        fibonacci(index);
    }

    static void fibonacci(int index) {

        int[] arrayFibonacci = new int[index+1];

        arrayFibonacci [0] = 0;
        arrayFibonacci [1] = 1;

        for (int i = 2; i < arrayFibonacci.length; i++) {
            arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
        }
        //System.out.println(Arrays.toString(arrayFibonacci));
        System.out.println(arrayFibonacci[index]);
    }
}