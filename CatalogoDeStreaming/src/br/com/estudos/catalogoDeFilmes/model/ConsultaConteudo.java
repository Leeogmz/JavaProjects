package br.com.estudos.catalogoDeFilmes.model;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class ConsultaConteudo {

    private String apiInicio = "http://www.omdbapi.com/?t=";
    private String title;
    private String apiKey = "&apikey=c6af06db";


    public ConteudoOMDB buscaConteudo(String title) {

        String endereco = apiInicio + title.replace(" ", "+") + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConteudoOMDB.class);

        } catch (Exception e) {

            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());

        }
		return null;


    }

}