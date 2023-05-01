package Model;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class ConsultaCep {

    private String url = "https://viacep.com.br/ws/";
    private String cep;
    private String arquivo = "/json/";

    public Endereco buscaEndereco(String cep) {

        String endereco = url + cep + arquivo;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {

            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP");
        }

    }

}
