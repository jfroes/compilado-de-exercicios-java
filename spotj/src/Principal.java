import br.com.alura.spotj.modelos.MinhasPreferidas;
import br.com.alura.spotj.modelos.Musica;
import br.com.alura.spotj.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.setArtista("Michael Jackson");
        musica.setAlbum("Thriller");
        musica.setGenero("Pop");
        musica.setTitulo("Billie Jean");
        musica.setDuracao(4.54);

        musica.curte();
        for (int i = 0; i < 2000; i++) {
            musica.reproduz();
        }


        System.out.println(musica.getTotalDecurtidas());
        System.out.println(musica.getTotalDeReproducoes());

        Podcast podcast = new Podcast();

        podcast.setTitulo("Monark Talks");
        podcast.setHost("Monark");
        podcast.setDescricao("""
                Podcast recebe convidados intelectuais para debater sobre
                diversos assuntos pertinentes a sociedade
                de forma lúcida e imparcial.
                """);

        System.out.println("Titulo: " + podcast.getTitulo());
        System.out.println("Host: " + podcast.getHost());
        System.out.println("Descrição: " + podcast.getDescricao());

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}