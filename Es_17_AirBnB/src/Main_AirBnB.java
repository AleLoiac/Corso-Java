import java.time.LocalDate;

public class Main_AirBnB {
    public static void main(String[] args) {
        AirBnb sistema = new AirBnb();

        Utente Pietro = new Utente("Pietro Pinna", "pietruccio@gmail.com", "Via Monte dei Paschi");
        Utente Marco = new Utente("Marco Mastri", "mastrota@gmail.com", "Via Pinco Pallo");
        Utente Gianni = new Utente("Gianni Fantoni", "fanti@gmail.com", "Via dei polli");

        sistema.addUtente(Pietro);
        sistema.addUtente(Marco);
        sistema.addUtente(Gianni);

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

        Prenotazione prenotazione1 = new Prenotazione("P1vp", LocalDate.of(2022, 9, 10), LocalDate.of(2022, 9, 20), villaPalla, Pietro);
        Prenotazione prenotazione2 = new Prenotazione("P2aa", LocalDate.of(2022, 9, 12), LocalDate.of(2022, 9, 21), appAugusto, Pietro);
        Prenotazione prenotazione3 = new Prenotazione("P3af", LocalDate.of(2022, 9, 7), LocalDate.of(2022, 9, 14), appFlavio, Marco);
        Prenotazione prenotazione4 = new Prenotazione("P4vp", LocalDate.of(2022, 9, 5), LocalDate.of(2022, 9, 9), villaPalla, Gianni);

        Pietro.addPrenotazione(prenotazione1);
        Pietro.addPrenotazione(prenotazione2);
        Marco.addPrenotazione(prenotazione3);
        Gianni.addPrenotazione(prenotazione4);

        System.out.println(sistema.idToUltimaPrenotaz("pp94"));

        Feedback feedbackVillaPalla = new Feedback("vp", "Che cesso", "Era tutto zozzo", Feedback.punteggio.DUE);

        Pietro.lasciaFeedback(feedbackVillaPalla, prenotazione1);
        Marco.lasciaFeedback(feedbackVillaPalla, prenotazione1);

        System.out.println(sistema.mediaLetti());

        System.out.println(sistema.abitazioneGettonata());

        sistema.changeToHost(Marco, "mm78");
        sistema.addHost(Marco);
        Marco.addAbitazione(appAugusto);

        System.out.println(sistema.miglioriHost());
    }
}
