package br.com.estudos.catalogoDeFilmes.model;

import br.com.estudos.catalogoDeFilmes.calculos.Classificavel;

public class Filme extends Conteudo implements Classificavel {

    public Filme(String nome, int anoLancamento, boolean inclusoNoPlano) {
        super(nome, anoLancamento, inclusoNoPlano);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) media()/2;
    }

    @Override
    public String toString() {
        
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")"; 
    }

}
