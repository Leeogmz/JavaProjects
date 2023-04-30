package br.com.estudos.catalogoDeFilmes.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.estudos.catalogoDeFilmes.Exception.ErroDeConversaoDeAnoException;
import br.com.estudos.catalogoDeFilmes.model.Conteudo;
import br.com.estudos.catalogoDeFilmes.model.ConteudoOMDB;

public class PrincipalComBusca {
    
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o filme você quer buscar? ");

        var apiInicio = "http://www.omdbapi.com/?t=";
        var busca = scanner.nextLine();
        var apiKey = "&apikey=c6af06db";
        var endereco = apiInicio+busca.replace(" ","+")+apiKey;


        try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

                HttpResponse<String> response = client
                .send(request, BodyHandlers.ofString());
                String json = response.body();
                

                Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
                //String jsonRepresentation = gson.toJson(someObject);
                
                ConteudoOMDB conteudoOMDB = gson.fromJson(json, ConteudoOMDB.class);
                //System.out.println(conteudoOMDB);

                //try {
                    Conteudo conteudo = new Conteudo (conteudoOMDB);
                    System.out.println(conteudo);

            } catch (NumberFormatException e) {

                    System.out.println("Aconteceu um erro: ");
                    System.out.println(e.getMessage());

            } catch (IllegalArgumentException i) {
                    System.out.println("Algum erro de argumento na busca, verifique o endereço");

            } catch (ErroDeConversaoDeAnoException e) {

                System.out.println(e.getMessage());

            }


        System.out.println("Programa finalizado");
         
         
          
        
    }
    
}
