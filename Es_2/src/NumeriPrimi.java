public class NumeriPrimi {

    public static void main(String[] args) {
        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {

        int i;
        if (number == 0 || number == 1) {
            System.out.println("Non è un numero primo");
            return false;
        }
        else {
                for (i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        System.out.println("Non è un numero primo");
                        return false;
                    }
                }

            }
        System.out.println("E' un numero primo");
        return true;
    }
}
