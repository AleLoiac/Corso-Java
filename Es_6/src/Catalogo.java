import java.util.List;

public class Catalogo {
    private List<ProdottoInCatalogo> catalogo;

    public Catalogo(List<ProdottoInCatalogo> catalogo) {
        this.catalogo = catalogo;
    }

    public void printCatalogo(){
        for(ProdottoInCatalogo prod : catalogo){
            System.out.println(prod);
        }
    }

    public List<ProdottoInCatalogo> getCatalogo() {
        return catalogo;
    }
}