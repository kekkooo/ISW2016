/**
 * Created by francescousai on 18/05/16.
 */
public class Brano {

    private String  titolo;
    private int     anno;
    private Artista artista;

    public  Brano( String titolo, int anno, Artista artista ){
        this.titolo  = titolo;
        this.anno    = anno;
        this.artista = artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", artista=" + artista +
                '}';
    }
}
