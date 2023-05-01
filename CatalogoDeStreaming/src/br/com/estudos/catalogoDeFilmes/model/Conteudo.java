package br.com.estudos.catalogoDeFilmes.model;

import com.google.gson.annotations.SerializedName;

import br.com.estudos.catalogoDeFilmes.Exception.ErroDeConversaoDeAnoException;

public class Conteudo implements Comparable<Conteudo> {


    @SerializedName("Title") 
    private String nome;

    @SerializedName("Year")
    private int anoLancamento;
    private boolean inclusoNoPlano;
    private double somaAvaliacao;
    private int totalAvalicoes;
    private int duracaoEmMinutos;

    public Conteudo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        
    }

    
    public Conteudo(ConteudoOMDB conteudoOMDB) {
        this.nome = conteudoOMDB.title();

    if(conteudoOMDB.year().length() > 4){
        throw new ErroDeConversaoDeAnoException ("Não consegui converter o ano " +
        "Porque tem mais de 4 caracteres");
    }
        this.anoLancamento = Integer.valueOf(conteudoOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(conteudoOMDB.runtime()
        .substring(0, 3));
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

    @Override
    public int compareTo(Conteudo outroConteudo) {
         return this.getNome().compareTo(outroConteudo.getNome());
    }

    @Override
    public String toString() {
        return "( Conteudo: " + nome + " | " + "Ano de lançamento: " + anoLancamento + " | " + "Duração em minutos: " + duracaoEmMinutos + " ) ";
    }

}
