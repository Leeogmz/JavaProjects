package br.com.estudos.catalogoDeFilmes.model;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorDeArquivo {

    public void geraArquivoJson(Conteudo conteudo) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter arquivo = new FileWriter(conteudo.getNome() + ".json");
        arquivo.write(gson.toJson(conteudo));
        arquivo.close();

    }

}
