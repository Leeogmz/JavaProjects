package br.com.minhasMusicas.Model;

public class MinhasPreferidas {

    public void inclui (Audio a) {
        if(a.getClassificacao() >= 9  ) {
            System.out.println(a.getTitulo() + " É considerado sucesso absoluto" + " e curtido por todos");
        } else {
            System.out.println(a.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
    }
    
}
