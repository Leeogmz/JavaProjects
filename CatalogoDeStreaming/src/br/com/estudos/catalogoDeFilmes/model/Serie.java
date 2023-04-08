package br.com.estudos.catalogoDeFilmes.model;

public class Serie extends Conteudo {

    private int temporadas;
    private int epsodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpsodio;


    public Serie(String nome, int anoLancamento, boolean inclusoNoPlano) {
        super(nome, anoLancamento, inclusoNoPlano);
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsodiosPorTemporada() {
        return this.epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public boolean getAtiva() {
        return this.ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpsodio() {
        return this.minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiosPorTemporada * minutosPorEpsodio;
    }
}
