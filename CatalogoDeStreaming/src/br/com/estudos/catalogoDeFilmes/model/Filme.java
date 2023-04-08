package br.com.estudos.catalogoDeFilmes.model;

public class Filme extends Conteudo {

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
}
