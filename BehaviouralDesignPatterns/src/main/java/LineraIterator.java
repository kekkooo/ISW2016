import java.util.ArrayList;

/**
 * Created by francescousai on 19/05/16.
 */
public class LineraIterator extends SequenceIterator {

    ArrayList<Playable> playables;
    int             cursor = 0;
    public LineraIterator( ArrayList<Playable> playables) {
        if( playables == null){ throw new IllegalArgumentException( "the playable sequence cannot be null" ); }

        this.playables = playables;
    }


    @Override
    public boolean hasNext() {
        return cursor < playables.size();
    }

    @Override
    public Playable Next() {
        ++cursor;
        return playables.get(cursor-1);
    }
}
