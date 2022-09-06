public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    private static boolean isPalindrome(String s) {
        int lunghezza = s.length();
        int norm = 0;
        int invert = lunghezza - 1;
        while (invert > norm) {
            char normCar = s.charAt(norm++);
            char invertCar = s.charAt(invert--);
            if (normCar != invertCar)
                return false;
        }
        return true;
    }

}

