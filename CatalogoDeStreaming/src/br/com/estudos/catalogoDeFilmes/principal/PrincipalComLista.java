package br.com.estudos.catalogoDeFilmes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.estudos.catalogoDeFilmes.model.Conteudo;
import br.com.estudos.catalogoDeFilmes.model.Filme;
import br.com.estudos.catalogoDeFilmes.model.Serie;

public class PrincipalComLista {

    public static void main(String[] args) {

        Filme oPoderoChefao = new Filme( "O poderoso chefão",1970,true);

        Filme misterioNoMediterraneo = new Filme("Misterio no Mediterraneo", 2022, true);

        Filme superMarioBros = new Filme("Super Mario Bros. - O Filme",2023, true);

        Serie vikings = new Serie("Vikings", 2016, true);

        List<Conteudo> conteudos = new LinkedList<>();
        conteudos.add(misterioNoMediterraneo);
        conteudos.add(oPoderoChefao);
        conteudos.add(superMarioBros);
        conteudos.add(vikings);


        for (Conteudo conteudo : conteudos) {

            System.out.println(conteudo.getNome());
            if(conteudo instanceof Filme filme) {
            //Filme filme = (Filme) conteudo;
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação " + buscaPorArtista);

        Collections.sort(conteudos);

        System.out.println("Lista de titulos ordenados" + conteudos);


        conteudos.sort(Comparator.comparing(Conteudo::getAnoLancamento));
        System.out.println("ordenando por ano " + conteudos);







    }
    
}
