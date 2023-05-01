package br.com.estudos.catalogoDeFilmes.principal;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.estudos.catalogoDeFilmes.Exception.ErroDeConversaoDeAnoException;
import br.com.estudos.catalogoDeFilmes.model.Conteudo;
import br.com.estudos.catalogoDeFilmes.model.ConteudoOMDB;

public class PrincipalComBusca {

    public static void main(String[] args) throws Exception {

        String apiInicio = "http://www.omdbapi.com/?t=";
        String apiKey = "&apikey=c6af06db";
        String busca = "";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        List<Conteudo> conteudos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);        

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Qual o filme você quer buscar? ");
            
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = apiInicio + busca.replace(" ", "+") + apiKey;

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, BodyHandlers.ofString());
                String json = response.body();

                ConteudoOMDB conteudoOMDB = gson.fromJson(json, ConteudoOMDB.class);

                Conteudo conteudo = new Conteudo(conteudoOMDB);
                System.out.println(conteudo);
                conteudos.add(conteudo);

            } catch (NumberFormatException e) {

                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException i) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");

            } catch (ErroDeConversaoDeAnoException e) {

                System.out.println(e.getMessage());

            }

        }

        System.out.println(conteudos);

        FileWriter escrita = new FileWriter("conteudo.json");
        escrita.write(gson.toJson(conteudos));
        escrita.close();
        System.out.println("Programa finalizado");

    }

}
