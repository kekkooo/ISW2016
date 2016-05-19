import java.util.Observable;
import java.util.Optional;

/**
 * Created by francescousai on 19/05/16.
 * This uses the built-in java.util.Observable to implement the Observer pattern
 */
public class Player extends Observable {
    Optional<Playable> current = Optional.empty();
    SequenceManager sequenceManager;
    boolean endOfSequence = false;

    public Player(SequenceManager sequenceManager) {
        if( sequenceManager == null){ throw new IllegalArgumentException( "the sequence manager cannot be null" ); }
        this.sequenceManager = sequenceManager;
        current = sequenceManager.getNextSong();
    }

    public void setPlayable( Playable p){
        if( p == null){ throw new IllegalArgumentException( "playable p cannot be null" ); }
        current = Optional.of( p );
    }

    public void Play(){
        if(current.isPresent()){
            current.get().Play();
            // this is the observable part of ObserverPattern
            // In java.util implementation you need to explicitely set that this object has changed
            // and unset it after the notification to observers has been sent.
            this.setChanged();
            this.notifyObservers();
            this.clearChanged();
        }else{
            endOfSequence = true;
            System.out.println( "There are no songs" );
        }
    }

    public void Next(){
        current = sequenceManager.getNextSong();
        this.Play();
    }

    public boolean isEndOfSequence() {
        return endOfSequence;
    }
}
