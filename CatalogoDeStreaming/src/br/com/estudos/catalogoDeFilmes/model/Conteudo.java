package br.com.estudos.catalogoDeFilmes.model;

public class Conteudo {

    private String nome;
    private int anoLancamento;
    private boolean inclusoNoPlano;
    private double somaAvaliacao;
    private int totalAvalicoes;
    private int duracaoEmMinutos;

    public Conteudo(String nome, int anoLancamento, boolean inclusoNoPlano) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public String getNome () {
        return this.nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean getInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getTotalAvalicoes() {
        return totalAvalicoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota){

        somaAvaliacao += nota;
        totalAvalicoes++;
    }

    public double media () {
        return somaAvaliacao / totalAvalicoes;
    }

}
