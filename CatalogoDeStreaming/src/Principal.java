import java.util.ArrayList;

import br.com.estudos.catalogoDeFilmes.calculos.CalculaTempo;
import br.com.estudos.catalogoDeFilmes.calculos.FiltroRecomendacao;
import br.com.estudos.catalogoDeFilmes.model.Epsodio;
import br.com.estudos.catalogoDeFilmes.model.Filme;
import br.com.estudos.catalogoDeFilmes.model.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme oPoderoChefao = new Filme( "O poderoso chefão",1970,true);
        oPoderoChefao.setDuracaoEmMinutos(180);
        oPoderoChefao.exibeFichaTecnica();
        oPoderoChefao.avalia(10);
        oPoderoChefao.avalia(8);
        oPoderoChefao.avalia(5);
        System.out.println(oPoderoChefao.getTotalAvalicoes());
        System.out.println(oPoderoChefao.media());

        Filme misterioNoMediterraneo = new Filme("Misterio no Mediterraneo", 2022, true);
        misterioNoMediterraneo.setDuracaoEmMinutos(180);

        Filme superMarioBros = new Filme("Super Mario Bros. - O Filme",2023, true);


        Serie vikings = new Serie("Vikings", 2016, true);
        vikings.setTemporadas(5);
        vikings.setEpsodiosPorTemporada(8);
        vikings.setMinutosPorEpsodio(40);

        System.out.println("Duração da serie: " + vikings.getDuracaoEmMinutos() + " minutos.");

        CalculaTempo calculadora = new CalculaTempo();
        calculadora.inclui(oPoderoChefao);
        calculadora.inclui(misterioNoMediterraneo);
        calculadora.inclui(vikings);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(oPoderoChefao);

        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setSerie(vikings);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(misterioNoMediterraneo);
        listaDeFilmes.add(oPoderoChefao);
        listaDeFilmes.add(superMarioBros);


        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());


        System.out.println(listaDeFilmes);






    }
}
