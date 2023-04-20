package br.com.minhasMusicas.Model;

public class Podcast extends Audio{

    private String Apresentador;
    private String descricao;


    public String getApresentador() {
        return Apresentador;
    }
    public void setApresentador(String apresentador) {
        Apresentador = apresentador;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public double getClassificacao() {

        if(this.getTotalDeCurtidas()>=500) {
            return 10;

        } else {
            return 8;
        }
    }

    
    
}
