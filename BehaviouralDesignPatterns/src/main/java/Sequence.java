import java.util.ArrayList;

/**
 * Created by francescousai on 19/05/16.
 */
public class Sequence {

    ArrayList<Playable> songs;

    public Sequence() {
        this.songs = new ArrayList<Playable>();
    }

    public void addSong( Song song ){
        if( song == null ){ throw new IllegalArgumentException(" the song cannot be null or empty" ); }
        this.songs.add( song );
    }

    public SequenceIterator getLinearIterator(){
        return new LineraIterator( songs );
    }

    public SequenceIterator getShuffleIterator( ShufflingStrategy strategy ){
        return new ShuffleIterator( strategy, songs );
    }
}
