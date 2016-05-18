/**
 * Created by francescousai on 18/05/16.
 */
public class CreatoreSequenzaBrani extends CreatoreSequenza {
    @Override
    public SequenzaBrani CreaPlaylistPersonale(String nomePlaylist) {
        return new Playlist( nomePlaylist );
    }

    @Override
    public SequenzaBrani CreaAlbum(String titolo, int anno, Artista artista) {
        return new Album( titolo, anno, artista );
    }
}
