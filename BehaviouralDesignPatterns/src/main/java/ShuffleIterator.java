import java.util.ArrayList;

/**
 * Created by francescousai on 19/05/16.
 */
public class ShuffleIterator extends SequenceIterator {

    ShufflingStrategy strategy;
    ArrayList<Playable> playables;

    public ShuffleIterator(ShufflingStrategy strategy, ArrayList<Playable> playables) {
        this.playables = playables;
        this.setStrategy( strategy );
    }

    public void setStrategy(ShufflingStrategy strategy) {
        this.strategy = strategy;
        this.strategy.setNumOfItems( playables.size( ));
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Playable Next() {
        return playables.get( strategy.getNextIndex( ));
    }
}
