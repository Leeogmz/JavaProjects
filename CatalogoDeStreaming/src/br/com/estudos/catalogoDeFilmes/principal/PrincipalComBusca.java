package br.com.estudos.catalogoDeFilmes.principal;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.estudos.catalogoDeFilmes.model.ConsultaConteudo;
import br.com.estudos.catalogoDeFilmes.model.Conteudo;
import br.com.estudos.catalogoDeFilmes.model.ConteudoOMDB;

public class PrincipalComBusca {

    public static void main(String[] args) throws Exception {

        

        List<Conteudo> conteudos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        ConsultaConteudo consulta = new ConsultaConteudo(); 
        
        

        //while (!conteudo.title().equalsIgnoreCase("sair")) {
            System.out.println("Qual o filme você quer buscar? ");

            ConteudoOMDB conteudo = consulta.buscaConteudo(scanner.nextLine());

            System.out.println(conteudo);
            

            //if (conteudo.title().equalsIgnoreCase("sair")) {
           //     break;
           // }

            

            
       // }

       /* System.out.println(conteudos);

        FileWriter escrita = new FileWriter("conteudo.json");
        escrita.write(gson.toJson(conteudos));
        escrita.close();
        System.out.println("Programa finalizado");*/

    }

}
