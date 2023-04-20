package br.com.minhasMusicas.Model;

public class Musica extends Audio {

    private String album;
    private String cantor;
    private String genero;


    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getTotalDeReproduções() {

        if(this.getTotalDeReproduções() > 200) {
            return 10;
        } else {
            return 7;
        }

       
    }

    
    
}
