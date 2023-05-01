package Main;

import java.io.IOException;
import java.util.Scanner;

import Model.ConsultaCep;
import Model.Endereco;
import Model.GeradorDeArquivo;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        System.out.println("Qual o CEP você quer pesquisar? ");

        try {
            Endereco endereco = consulta.buscaEndereco(scanner.nextLine());
            System.out.println(endereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.geraArquivoJson(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada! ");

        }

    }

}
