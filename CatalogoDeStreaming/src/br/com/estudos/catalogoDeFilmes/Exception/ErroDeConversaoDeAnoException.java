package br.com.estudos.catalogoDeFilmes.Exception;

public class ErroDeConversaoDeAnoException extends RuntimeException {

    private String mensagem;


    public ErroDeConversaoDeAnoException (String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
