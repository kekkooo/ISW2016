/**
 * Created by francescousai on 18/05/16.
 */
public class Artista {
    String Nome;

    public Artista(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "Nome='" + Nome + '\'' +
                '}';
    }
}
