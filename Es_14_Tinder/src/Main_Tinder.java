public class Main_Tinder {
    public static void main(String[] args) {
        Tinder tinder = new Tinder();

        Utente Franca = new Utente("Franca","Pippa");
        Utente Gianni = new Utente("Gianni","Fantoni");
        Utente Maura = new Utente("Maura","Castelli");

        Interesse leggere = new Interesse("L", "Leggere dei libri");
        Interesse arrampicarsi = new Interesse("A", "Arrampicarsi sugli alberi");
        Interesse parlare = new Interesse("P", "parlare ai cani");

        tinder.addUtente(Franca, parlare);
        tinder.addInteresse(Franca, leggere);

        tinder.addUtente(Gianni, leggere);
        tinder.addInteresse(Gianni, arrampicarsi);

        tinder.addUtente(Maura, parlare);
        tinder.addInteresse(Maura, arrampicarsi);
        tinder.addInteresse(Maura, leggere);
        //tinder.stampaTinder();

        System.out.println(tinder.pointsMatch(Franca, Gianni));
        System.out.println(tinder.pointsMatch(Franca, Maura));

        System.out.println(tinder.bestMatch(Franca).getNome());
    }
}
