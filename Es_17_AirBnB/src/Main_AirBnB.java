public class Main_AirBnB {
    public static void main(String[] args) {
        AirBnb sistema = new AirBnb();

        Utente Pietro = new Utente("Pietro Pinna", "pietruccio@gmail.com", "Via Monte dei Paschi");
        Utente Marco = new Utente("Marco Mastri", "mastrota@gmail.com", "Via Pinco Pallo");

        sistema.addUtente(Pietro);
        sistema.addUtente(Marco);

        Abitazione villaPalla = new Abitazione("vp1", "Villa Palla", "Via della palla", 8, 4, 0);
        Abitazione appFlavio = new Abitazione("af1", "Appartamento Flavio", "Via dei Flavi", 3, 2, 4);
        Abitazione appAugusto = new Abitazione("aa1", "Appartamento Augusto", "Via degli Augusti", 4, 1, 2);

        Pietro.addAbitazione(appFlavio);
        sistema.changeToHost(Pietro, "pp94");
        Pietro.addAbitazione(appFlavio);
        Pietro.addAbitazione(villaPalla);

        System.out.println(Pietro.getCodiceHost());
        System.out.println(Marco.getCodiceHost());

        sistema.addHost(Pietro);
        sistema.addHost(Marco);

        System.out.println(sistema.idToAbitazioni("pp94"));
        System.out.println(sistema.idToAbitazioni("fggf"));

        Prenotazione prenotazione1 = new Prenotazione("P1vp", "11/10/2022", "21/10/2022", villaPalla, Pietro);
        Prenotazione prenotazione2 = new Prenotazione("P2aa", "21/11/2022", "30/11/2022", appAugusto, Pietro);

        Pietro.addPrenotazione(prenotazione1);
        Pietro.addPrenotazione(prenotazione2);

        System.out.println(sistema.idToUltimaPrenotaz("pp94"));
    }
}
