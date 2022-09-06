public class Main {

    public static void main(String[] args) {
        System.out.println("Buonasera");
        String s = "Salve amici";
        int len = s.length();
        System.out.println(len);
        String s2 = s.substring(1,9);
        System.out.println(s2);
        System.out.println(s.equals(s2));
        char c = s.charAt(4);
        System.out.println(c);
        String s3 = s.toUpperCase();
        System.out.println(s3);

        double number = 5.2;
        System.out.println(number++); //l'ha incrementato ma non ancora printato
        System.out.println(++number); //l'ha incrementato di +1 prima di printare e ancora +1 da prima

    }

}
