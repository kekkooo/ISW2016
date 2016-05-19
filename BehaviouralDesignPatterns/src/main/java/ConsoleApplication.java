/**
 * Created by francescousai on 19/05/16.
 */


public class ConsoleApplication {



    private static Advertiser createAdvertiser(){
        Advertising adv         = new Advertising( "EvaQ" );
        return  new Advertiser( 2, adv );
    }

    private static Sequence createSequence(){
        Song anaconda           = new Song("Anaconda");
        Song bocciofili         = new Song("Bocciofili");
        Song guaglione          = new Song("Guaglione");
        Song nondirglimai       = new Song( "Non Dirgli Mai");
        Song unaCanzoneDeIlVolo = new Song("Una Canzone de Il Volo");
        Song supercafone        = new Song("SuperCafone");
        Song iThinkYouFreaky    = new Song("I fink u freeky" );


        Sequence seq = new Sequence();
        seq.addSong(anaconda);
        seq.addSong(bocciofili);
        seq.addSong(guaglione);
        seq.addSong(nondirglimai);
        seq.addSong(unaCanzoneDeIlVolo);
        seq.addSong(supercafone);
        seq.addSong(iThinkYouFreaky);

        return seq;
    }

    private static ShufflingStrategy getSkipStrategy(){
        return new ShufflingStrategySkip3();
    }

    private static ShufflingStrategy getFancyStrategy(){
        return new ShufflingStrategyFancy();
    }

    public static void main( String args[]){
        Sequence sequence = createSequence();
        Advertiser advertiser = createAdvertiser();
        SequenceManager sequenceManager = new SequenceManager( sequence );

        Player player = new Player( sequenceManager );
        player.addObserver( advertiser );
        System.out.println( "Linear Playback: " );

        player.Play();
        while( !player.isEndOfSequence()){
            player.Next();
        }

        System.out.println( "Shuffle Playback with skip strategy : " );
        sequenceManager.setShufflePlayMode( getSkipStrategy() );

        player.Play();
        // cannot use while since shuffle will never end
        for( int i =0; i < 10; ++i){
            player.Next();
        }

        System.out.println( "Shuffle Playback with fancy strategy : " );
        sequenceManager.setShufflePlayMode( getFancyStrategy() );

        player.Play();
        // cannot use while since shuffle will never end
        for( int i =0; i < 10; ++i){
            player.Next();
        }


    }
}
