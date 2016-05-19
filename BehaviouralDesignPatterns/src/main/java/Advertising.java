/**
 * Created by francescousai on 19/05/16.
 */
public class Advertising extends  Playable {

    private String title;

    public Advertising(String title) {
        if( title == null || title.isEmpty() ){ throw new IllegalArgumentException("title cannot be null or empty" ); }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void Play() {
        System.out.println( "Currently Playng the ADVERTISING : " + this.title );
    }
}
