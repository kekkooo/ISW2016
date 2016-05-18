import java.util.ArrayList;

/**
 * Created by francescousai on 18/05/16.
 */
public abstract class SequenzaBrani {
    protected ArrayList<Brano> brani;
    protected String  titolo;

    public SequenzaBrani( String titolo ){
        if( titolo == null || titolo.isEmpty() ) { throw new IllegalArgumentException(" brano cannot be null or empty "); }
        this.titolo = titolo;
        brani = new ArrayList<Brano>();
    }

    public abstract void addBrano( Brano b );

    public String getTitolo() {
return titolo;
    }
    public ArrayList<Brano> getBrani(){ return brani; }
}
