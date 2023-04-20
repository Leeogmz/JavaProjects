package br.com.minhasMusicas.Model;


public class Audio {    
    
    private String titulo;
    private int totalDeReproduções;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }
    
    
    public void setTitulo( String titulo) {
        this.titulo = titulo;
    }


    public int getTotalDeReproduções() {
        return totalDeReproduções;
    }


    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }


    public double getClassificacao() {
        return classificacao;
    }
    
    
    public void curte(){
        this.totalDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproduções++;
    }

}