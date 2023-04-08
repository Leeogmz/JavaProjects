package br.com.estudos.catalogoDeFilmes.calculos;

import br.com.estudos.catalogoDeFilmes.model.Conteudo;

public class CalculaTempo {
    private int tempoTotal;


    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Conteudo c) {
        tempoTotal += c.getDuracaoEmMinutos();
    }
}
