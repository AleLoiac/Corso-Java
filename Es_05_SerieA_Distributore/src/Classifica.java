import java.util.Arrays;

public class Classifica {

    public Classifica(int numSquadre) {
        this.squadre = new Squadra[numSquadre];
    }

    private Squadra [] squadre;

    public void addSquadra(Squadra squadra) {
        for (int i = 0; i < squadre.length; i++){
            if (squadre[i] == null){
                squadre[i] = squadra;
                break;
            }
        }
    }

    public void esitoPartita(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite){
        if (golCasa > golOspite){
            squadraCasa.addPunteggio(3);
        }
        else if(golCasa < golOspite){
            squadraOspite.addPunteggio(3);
        }
        else {
            squadraCasa.addPunteggio(1);
            squadraOspite.addPunteggio(1);
        }
        squadraCasa.addGol(golCasa);
        squadraOspite.addGol(golOspite);
        squadraCasa.addGolSub(golOspite);
        squadraOspite.addGolSub(golCasa);
    }

    public String getMigliorAttacco(){
        int temp = -1;
        String getName = "";
        for (int i = 0; i < squadre.length; i++){
            if (squadre[i]!=null && squadre[i].getGolFatti()>temp){
                temp = squadre[i].getGolFatti();
                getName = squadre[i].getNome();
            }
        }
        return getName;
    }

    public String getPeggiorDifesa(){
        int temp = -1;
        String getName = "";
        for (int i = 0; i < squadre.length; i++){
            if (squadre[i]!=null && squadre[i].getGolSubiti()>temp){
                temp = squadre[i].getGolSubiti();
                getName = squadre[i].getNome();
            }
        }
        return getName;
    }

    void bubbleSort(Squadra[] squadreTemp)
    {
        int limit = 0;
        for (int i = 0; i < squadreTemp.length; i++){
            if (squadreTemp[i] != null){
                limit = i;
            }
        }

        for (int i = 0; i < limit; i++)
            for (int j = 0; j < limit - i; j++)
                if (squadreTemp[j].getPunteggio() < squadreTemp[j + 1].getPunteggio()) {
                    // swap arr[j+1] and arr[j]
                    Squadra temp = squadreTemp[j];
                    squadreTemp[j] = squadreTemp[j + 1];
                    squadreTemp[j + 1] = temp;
                }
    }


    public void getClassifica(){
        bubbleSort(squadre);

        for( Squadra sq : squadre){
            if(sq!= null){
                System.out.println(sq.getNome() + " punteggio: " + sq.getPunteggio());
            }else{
                break;
            }
        }
    }

}
