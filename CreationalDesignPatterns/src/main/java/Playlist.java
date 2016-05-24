/**
 * Created by francescousai on 18/05/16.
 */
public class Playlist extends SequenzaBrani {

    public Playlist(String titolo) {
        super(titolo);
    }

    @Override
    public void addBrano(Brano b) {
        if( b == null ) {
            throw new IllegalArgumentException(" brano cannot be null "); }
        this.brani.add(b);
    }

    @Override
    public String toString() {
        return "Playlist{titolo= "+ this.getTitolo() + "}";
    }
}
