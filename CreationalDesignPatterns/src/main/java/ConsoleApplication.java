/**
 * Created by francescousai on 18/05/16.
 */
public class ConsoleApplication {
    public static void main(String args[]){

        Artista nickiMinaj   = new Artista("Nicki Minaj");
        Artista dargenDAmico = new Artista("Dargen D'Amico");
        Artista gigiDAlessio = new Artista("Gigi D'Alessio");

        Brano guaglione         = new Brano("Guaglione", 2015, gigiDAlessio );
        Brano nonDirgliMai      = new Brano("Non Dirgli Mai", 2015, gigiDAlessio );
        Brano bocciofili        = new Brano("Bocciofili", 2013, dargenDAmico);
        Brano allenatichefabene = new Brano("Allenatichefabene", 2012, dargenDAmico);
        Brano anaconda          = new Brano("Anaconda", 2014, nickiMinaj );
        Brano getOnYourKnees    = new Brano("Get On Your Knees", 2014, nickiMinaj);

        CreatoreSequenza creator = new CreatoreSequenzaBrani();

        SequenzaBrani p = creator.CreaPlaylistPersonale( "Estate 2016");

        GestoreSequenza.getInstance().AggiungiBrano( p, bocciofili );
        GestoreSequenza.getInstance().AggiungiBrano( p, allenatichefabene );
        GestoreSequenza.getInstance().AggiungiBrano( p, anaconda );
        GestoreSequenza.getInstance().AggiungiBrano( p, getOnYourKnees );

        SequenzaBrani giggi = creator.CreaAlbum("Disco di Giggi", 2015, gigiDAlessio );

        GestoreSequenza.getInstance().AggiungiBrano( giggi, guaglione );
        GestoreSequenza.getInstance().AggiungiBrano( giggi, nonDirgliMai );

        // this should throw an exception, we handle it inside AggiungiBrano
        GestoreSequenza.getInstance().AggiungiBrano( giggi, anaconda );


        System.out.println( p );
        for( Brano b : p.getBrani() ){
            System.out.println( b );
        }

        System.out.println( giggi );
        for( Brano b : giggi.getBrani() ){
            System.out.println( b );
        }
    }
}
