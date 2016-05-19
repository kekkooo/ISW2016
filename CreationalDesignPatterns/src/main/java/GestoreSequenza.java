/**
 * Created by francescousai on 18/05/16.
 */
public class GestoreSequenza {
    private static GestoreSequenza instance;

    private GestoreSequenza(){}

    public static  GestoreSequenza getInstance(){
        if( instance == null ){
            instance = new GestoreSequenza();
        }
        return instance;
    }

    public void AggiungiBrano( SequenzaBrani sequenza, Brano b ){
        try{
            sequenza.addBrano( b );
        }catch(IllegalArgumentException e){
            System.out.println( "Cannot add " + b + "to " + sequenza + "\n error:" + e.getMessage() );
        }
    }
}
