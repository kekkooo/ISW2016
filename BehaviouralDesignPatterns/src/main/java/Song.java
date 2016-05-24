/**
 * Created by francescousai on 19/05/16.
 */
public class Song extends Playable {

    private String title;

    public Song( String title ) {
        if( title == null || title.isEmpty() ){ throw new IllegalArgumentException("title cannot be null or empty" ); }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void Play() {
        System.out.println( "Currently Playing the SONG : " + this.title );
    }
}
