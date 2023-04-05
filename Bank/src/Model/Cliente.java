package Model;

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    private double renda;
    private String tipoConta;

    public Cliente(String nome, String cpf, String profissao, double renda, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.renda = renda;
        this.tipoConta = tipoConta;
    }  

    public Cliente(String nome, String cpf, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }


    public String getNome() {
       return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }  
   
}