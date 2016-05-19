import java.util.Observable;
import java.util.Observer;

/**
 * Created by francescousai on 19/05/16.
 */
public class Advertiser implements Observer {

    int numOfPlayedSongs = 0;
    int numOfSongsBeforeAdvertising;
    Advertising adv;

    public Advertiser(int numOfSongsBeforeAdvertising, Advertising adv) {
        if( numOfSongsBeforeAdvertising< 0 ){ throw new IllegalArgumentException( "numOfSongsBeforeAdvertising cannot be negative" ); }
        if( adv== null){ throw new IllegalArgumentException( "adv cannot be null" ); }

        this.numOfSongsBeforeAdvertising = numOfSongsBeforeAdvertising;
        this.adv = adv;
    }

    public void update(Observable o, Object arg) {
        ++numOfPlayedSongs;
        if( numOfPlayedSongs == numOfSongsBeforeAdvertising ){
            Player player = (Player)o;
            player.setPlayable( adv );
            player.Play();
            numOfPlayedSongs = 0;
        }
    }
}
