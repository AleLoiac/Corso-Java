import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_Streaming {
    public static void main(String[] args) {

        Profilo famigliaRossi = new Profilo("FamigliRossi", "1234");
        famigliaRossi.setTipoDiOfferta(1);
        famigliaRossi.getTipoDiOfferta();
        Utente GinoRossi = new Utente("Gino", "3232", 78);
        System.out.println(GinoRossi.chiediPassword("3232"));
        famigliaRossi.cambiaTipoUtente(GinoRossi, "1234");
        System.out.println(GinoRossi.getTipo());
        Profilo famigliaBianchi = new Profilo("FamigliaBianchi", "5678");
        GinoRossi.changePin(32, "3232");

        Film Troy = new Film("Troy", 2004, ProdottoInCatalogo.genere.GUERRA, ProdottoInCatalogo.parentalGuidance._14_18, ProdottoInCatalogo.originale.ORIGINALE);
        Film Inception = new Film("Inception", 2010, ProdottoInCatalogo.genere.AZIONE, ProdottoInCatalogo.parentalGuidance._14_18, ProdottoInCatalogo.originale.ORIGINALE);
        Film Gold = new Film("Gold", 2016, ProdottoInCatalogo.genere.AZIONE, ProdottoInCatalogo.parentalGuidance._14_18, ProdottoInCatalogo.originale.ORIGINALE);
        SerieTV Game_of_Thrones = new SerieTV("Game of Thrones",2011, ProdottoInCatalogo.genere.GUERRA, ProdottoInCatalogo.parentalGuidance._OVER_18, ProdottoInCatalogo.originale.ORIGINALE,10,8);
        SerieTV Breaking_Bad =new SerieTV("Breaking Bad",2008, ProdottoInCatalogo.genere.AZIONE, ProdottoInCatalogo.parentalGuidance._14_18, ProdottoInCatalogo.originale.ORIGINALE,10,5);

        GinoRossi.addProdotto(Troy);
        GinoRossi.addProdotto(Inception);
        System.out.println(Arrays.toString((GinoRossi.stampaLista())));
        GinoRossi.assegnaVoto(Troy, 5);
        GinoRossi.assegnaVoto(Gold, 4);
        GinoRossi.assegnaVoto(Inception, 4);
        GinoRossi.printValutazioni();

        Utente MarioBianchi = new Utente("Mario", "1111", 12);
        MarioBianchi.assegnaVoto(Gold, 5);
        Gold.printVotiUtenti();
        //Gold.getGenere();
        //Troy.getGenere();

        //Gold.generiUguali();
        //Troy.generiUguali();

        System.out.println(Arrays.toString((MarioBianchi.stampaLista())));

        GinoRossi.consigli();

        List<ProdottoInCatalogo> ListaProdotti = new ArrayList<>();
        ListaProdotti.add(Gold);
        ListaProdotti.add(Inception);
        ListaProdotti.add(Troy);
        ListaProdotti.add(Game_of_Thrones);
        ListaProdotti.add(Breaking_Bad);
        Catalogo catalogo1 = new Catalogo(ListaProdotti);

        catalogo1.categoriaUguale(Troy);
        catalogo1.categoriaUguale(Game_of_Thrones);

        catalogo1.generiUguali(Troy);
        catalogo1.generiUguali(Game_of_Thrones);
        catalogo1.popolari(GinoRossi, MarioBianchi);
    }
}
