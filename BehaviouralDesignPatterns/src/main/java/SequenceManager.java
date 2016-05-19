import java.util.Optional;

/**
 * Created by francescousai on 19/05/16.
 */
public class SequenceManager {

    PlayMode playMode;
    Sequence sequence;
    SequenceIterator sequenceIterator;
    ShufflingStrategy strategy;

    public SequenceManager( Sequence sequence ) {
        this.sequence = sequence;
        setLinearPlayMode();
    }

    public void setSequence( Sequence sequence ){
        if( sequence == null ){ throw  new IllegalArgumentException("provided sequence cannot be null" );}

        this.sequence = sequence;
        switch (playMode){
            case LINEAR:{
                setLinearPlayMode();
                break;
            }
            case SHUFFLE:{
                setShufflePlayMode( this.strategy );
                break;
            }
        }
    }

    public void setLinearPlayMode(){
        playMode = PlayMode.LINEAR;
        this.sequenceIterator = sequence.getLinearIterator();
    }

    public void setShufflePlayMode(  ShufflingStrategy strategy ){
        if( strategy == null ){ throw  new IllegalArgumentException("provided strategy cannot be null" );}

        playMode = PlayMode.SHUFFLE;
        this.strategy = strategy;
        this.sequenceIterator = sequence.getShuffleIterator( this.strategy );
    }


    public Optional<Playable> getNextSong(){
        if(sequenceIterator.hasNext()){
            return Optional.of( sequenceIterator.Next( ));
        }else{
            return Optional.empty();
        }
    }
}
