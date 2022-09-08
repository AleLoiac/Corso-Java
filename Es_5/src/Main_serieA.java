import java.util.Arrays;

public class Main_serieA {
    public static void main(String[] args) {

        Classifica classifica = new Classifica(7);
        Squadra Milan = new Squadra(1, "Milan");
        Squadra Inter = new Squadra(2, "Inter");
        Squadra Napoli = new Squadra(3, "Napoli");
        Squadra Juve = new Squadra(4, "Juve");
        classifica.addSquadra(Milan);
        classifica.addSquadra(Inter);
        classifica.addSquadra(Napoli);
        classifica.addSquadra(Juve);

        classifica.esitoPartita(Milan,3, Inter,2);
        //System.out.println(Milan.getPunteggio());
        //System.out.println(Inter.getPunteggio());
        classifica.esitoPartita(Milan,2, Inter,2);
        classifica.esitoPartita(Milan,2, Napoli,11);
        classifica.esitoPartita(Juve,3, Inter,3);
        System.out.println(Milan.getPunteggio());
        System.out.println(Inter.getPunteggio());
        System.out.println(Napoli.getPunteggio());
        System.out.println("Milan " + Milan.getGolFatti());
        System.out.println("Inter " + Inter.getGolFatti());
        System.out.println("Napoli " + Napoli.getGolFatti());
        System.out.println(classifica.getMigliorAttacco());
        System.out.println(classifica.getPeggiorDifesa());

        classifica.getClassifica();
    }
}
