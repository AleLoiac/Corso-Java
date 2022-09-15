public class Es_2 {
    public static void main(String[] args) {

        String stringa = "3";
        try {
            int lunghezza = stringa.length();
            try {
                Integer.parseInt(stringa);
            } catch(NumberFormatException nfe) {
                throw new ExceptionNotString("Non è una stringa numerica");
            }
        } catch (NullPointerException npe) {
            System.out.println("La stringa è null");
        } catch (ExceptionNotString ens){
            System.out.println(ens.getMessage());
        }
        System.out.println(stringa);
    }

    public static class ExceptionNotString extends Exception{
        public ExceptionNotString(String errorMessage){
            super(errorMessage);
        }

    }
}
