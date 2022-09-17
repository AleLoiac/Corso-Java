public class SerieTV extends ProdottoInCatalogo{

    public SerieTV(String titolo, int anno, genere Genere, parentalGuidance PG, originale Or, int episodiStagione, int numeroStagioni) {
        super(titolo, anno, Genere, PG, Or);
        this.episodiStagione = episodiStagione;
        this.numeroStagioni = numeroStagioni;
    }

    private int numeroStagioni;

    private int episodiStagione;

}
