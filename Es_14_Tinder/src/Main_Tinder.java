public class Main_Tinder {
    public static void main(String[] args) {
        Tinder tinder = new Tinder();

        Utente Franca = new Utente("Franca","Pippa");
        Utente Gianni = new Utente("Gianni","Fantoni");
        Utente Maura = new Utente("Maura","Castelli");
        Utente Poppo = new Utente("Poppo","Poppo");
        Utente Marco = new Utente("Marco","Rossi");
        Utente Gino = new Utente("Gino","Frassino");

        Interesse leggere = new Interesse("LEG", "Leggere dei libri");
        Interesse arrampicarsi = new Interesse("ARR", "Arrampicarsi sugli alberi");
        Interesse parlare = new Interesse("PAR", "parlare ai cani");

        tinder.addUtente(Gianni, leggere);
        tinder.addInteresse(Gianni, arrampicarsi);

        tinder.addUtente(Franca, parlare);
        tinder.addInteresse(Franca, leggere);
        tinder.addInteresse(Franca, arrampicarsi);

        tinder.addUtente(Maura, parlare);
        tinder.addInteresse(Maura, arrampicarsi);
        tinder.addInteresse(Maura, leggere);

        tinder.addUtente(Poppo, leggere);
        tinder.addUtente(Marco, arrampicarsi);

        tinder.addUtente(Gino, arrampicarsi);
        tinder.stampaTinder();

        System.out.println(tinder.pointsMatch(Franca, Gianni));
        System.out.println(tinder.pointsMatch(Franca, Maura));

        System.out.println(tinder.bestMatch(Franca).getNome());

        System.out.println(tinder.topMatch());
    }
}
