import java.util.*;

public class Catalogo {

    public Catalogo(List<ProdottoInCatalogo> catalogo) {
        this.catalogo = catalogo;
    }

    private List<ProdottoInCatalogo> catalogo;


    public void printCatalogo(){
        for(ProdottoInCatalogo prod : catalogo){
            System.out.println(prod);
        }
    }

    public List<ProdottoInCatalogo> getCatalogo() {
        return catalogo;
    }

    public void categoriaUguale (ProdottoInCatalogo prodotto){
        System.out.print("Categoria "+prodotto.getClass().getSimpleName()+": ");
        for (int i = 0; i < catalogo.size(); i++){
            if (prodotto.getClass().getSimpleName().equals(catalogo.get(i).getClass().getSimpleName())){
                System.out.print(catalogo.get(i).getTitolo()+", ");
            }
        }
        System.out.println(" ");
    }

    public void generiUguali(ProdottoInCatalogo prodotto){
        System.out.print(prodotto.getTitolo() + " stesso genere: ");
        String[] generi = new String[5];
        int counter = 0;
        for (int i =0; i<catalogo.size(); i++){
            if(catalogo.get(i)!=null && prodotto.getGenere().equals(catalogo.get(i).getGenere())){
                generi[counter] = catalogo.get(i).getTitolo();
                counter++;
            }
        }
        for(int i = 0; i <counter; i++){
            System.out.print(generi[i] + ", ");
        }
        System.out.println("");
    }

    public void popolari (Utente utente1, Utente utente2){
        List<ProdottoInCatalogo> li = new ArrayList<>(this.catalogo);
        li.sort(new Comparator<ProdottoInCatalogo>() {
            @Override
            public int compare(ProdottoInCatalogo o1, ProdottoInCatalogo o2) {
                return o2.getMediaValutazioni()-o1.getMediaValutazioni();
            }
        });

        for (ProdottoInCatalogo prodottoInCatalogo : li) {
            System.out.println(prodottoInCatalogo.getTitolo() + " Valutazioni: " + prodottoInCatalogo.getMediaValutazioni());
        }
    }

    Map<ProdottoInCatalogo, Integer> map;

    public void putInt(ProdottoInCatalogo prodotto){
            this.map.put(prodotto, prodotto.getMediaValutazioni());
    }



}