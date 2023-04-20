package br.com.minhasMusicas.Principal;
import br.com.minhasMusicas.Model.MinhasPreferidas;
import br.com.minhasMusicas.Model.Musica;
import br.com.minhasMusicas.Model.Podcast;

public class Main {

    public static void main(String[] args) {

        Musica minhaMusica  = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss"); 
        
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
                }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
            
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 500; i++) {

            meuPodcast.curte();            
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);



    }

}    
