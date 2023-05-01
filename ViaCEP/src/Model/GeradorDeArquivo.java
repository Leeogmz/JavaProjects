package Model;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorDeArquivo {

    public void geraArquivoJson(Endereco endereco) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter arquivo = new FileWriter(endereco.cep() + ".json");
        arquivo.write(gson.toJson(endereco));
        arquivo.close();

    }

}
