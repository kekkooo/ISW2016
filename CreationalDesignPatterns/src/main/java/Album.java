/**
 * Created by francescousai on 18/05/16.
 */
public class Album extends SequenzaBrani {


    private int     anno;
    private Artista artista;

    public Album( String titolo, int anno, Artista artista ){
        super( titolo );
        this.anno    = anno;
        this.artista = artista;
    }

    @Override
    public void addBrano(Brano b) {
        if( b == null ) { throw new IllegalArgumentException(" brano cannot be null "); }
        if(!( b.getArtista().getNome().toUpperCase().equals( this.artista.getNome().toUpperCase()))){
            throw new IllegalArgumentException( " Each brano should be of the same artist. " +
                                                b.getArtista().getNome() + "!=" + this.artista.getNome());
        }
        this.brani.add(b);
    }

    public int getAnno() {
        return anno;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "anno=" + anno +
                ", artista=" + artista +
                '}';
    }
}
