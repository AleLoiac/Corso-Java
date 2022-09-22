import Errori.EmailNonTrovata;
import Errori.IDNonTrovato;

import java.time.LocalDate;

public class Main_AirBnB {
    public static void main(String[] args) {
        AirBnb sistema = new AirBnb();

        Utente Pietro = new Utente("Pietro Pinna", "pietruccio@gmail.com", "Via Monte dei Paschi");
        Utente Marco = new Utente("Marco Mastri", "mastrota@gmail.com", "Via Pinco Pallo");
        Utente Gianni = new Utente("Gianni Fantoni", "fanti@gmail.com", "Via dei polli");
        Utente Pina = new Utente("Pina Muzzu", "pinuccia@gmail.com", "Via coi pecuri");
        Utente Mara = new Utente("Mara Venier", "maraa@gmail.com", "Via col vento");
        Utente Gennara = new Utente("Gennara Giunco", "ggggiunco@gmail.com", "Via brombeis");

        sistema.addUtente(Pietro);
        sistema.addUtente(Marco);
        sistema.addUtente(Gianni);
        sistema.addUtente(Pina);
        sistema.addUtente(Mara);
        sistema.addUtente(Gennara);
        sistema.addUtente(Gennara);
        //controllo se rimuove i duplicati
        System.out.println(sistema.getNomiUtenti());

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

        try {
            System.out.println(sistema.idToAbitazioni("pp94"));
        } catch (IDNonTrovato idnt) {
            System.out.println(idnt.getMessage());
        }
        try {
            System.out.println(sistema.idToAbitazioni("fggf"));
        } catch (IDNonTrovato idnt) {
            System.out.println(idnt.getMessage());
        }

        Prenotazione prenotazione1 = new Prenotazione("P1vp", LocalDate.of(2022, 9, 10), LocalDate.of(2022, 9, 20), villaPalla, Pietro);
        Prenotazione prenotazione2 = new Prenotazione("P2aa", LocalDate.of(2022, 9, 12), LocalDate.of(2022, 9, 21), appAugusto, Pietro);
        Prenotazione prenotazione3 = new Prenotazione("P3af", LocalDate.of(2022, 9, 7), LocalDate.of(2022, 9, 14), appFlavio, Marco);
        Prenotazione prenotazione4 = new Prenotazione("P4vp", LocalDate.of(2022, 9, 5), LocalDate.of(2022, 9, 9), villaPalla, Gianni);

        //prova a prenotarselo da solo e quindi la prenotazione 1 non aggiunge ore a pietro e non viene conteggiata
        Pietro.addPrenotazione(prenotazione1);

        Pietro.addPrenotazione(prenotazione2);
        Marco.addPrenotazione(prenotazione3);
        Gianni.addPrenotazione(prenotazione4);

        try {
            System.out.println(sistema.emailToUltimaPrenotazione("pietruccio@gmail.com"));
        } catch (EmailNonTrovata ent) {
            System.out.println(ent.getMessage());
        }

        Feedback feedbackVillaPalla = new Feedback("aa", "Che cesso", "Era tutto zozzo", Feedback.punteggio.CINQUE);

        Pietro.lasciaFeedback(feedbackVillaPalla, prenotazione2);
        Marco.lasciaFeedback(feedbackVillaPalla, prenotazione1);

        //fa la media solo su 2 appartamenti perchè il terzo non è ancora stato aggiunto nel sistema di affitto
        System.out.println(sistema.mediaLetti());

        System.out.println(sistema.abitazioneGettonata());

        sistema.changeToHost(Marco, "mm78");
        sistema.addHost(Marco);
        Marco.addAbitazione(appAugusto);

        System.out.println(sistema.miglioriHost());

        System.out.println(prenotazione1.durataPrenotazione());

        System.out.println(sistema.giorniUtente());

    }
}
