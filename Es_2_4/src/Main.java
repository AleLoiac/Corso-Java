public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
    }

    private static long factorial(int n) {
        int i;
        long temp = n;
        if (n == 0){
            System.out.println(1);
        }
        else{
            for (i = n - 1; i > 0; i--){
                temp = temp * i;
            }
            System.out.println(temp);
        }
        return temp;
    }

}
