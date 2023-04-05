package Model;
public class Conta {

private int agencia;
private int numero;
private double saldo;
private Cliente titular;



public Conta(int agencia, int numero, double saldo, Cliente titular) {
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = saldo;
    this.titular = titular;
}

public int getAgencia () {
    return this.agencia;
}

public int getNumero() {
    return this.numero;
}

public double getSaldo() {
    return this.saldo;
}

public Cliente getTitular () {
    return this.titular;
}

public void setAgencia(int agencia) {
    this.agencia = agencia;
}

public void setNumero (int numero) {
    this.numero = numero;
}

public void setTitular (Cliente titular) {
    this.titular = titular;
}

public void setSaldo (double saldo) {
    this.saldo = saldo;
}

public void deposita(double valor) {
    this.saldo += valor;
    System.out.println("Deposito realizado com sucesso, você depositou " + valor + " Seu novo saldo é: " + this.saldo);

} 

public void saca(double valor) {
    if(valor > this.saldo) {
        System.out.println("Saldo insuficiente! seu saldo é: " + this.saldo);
    } else {
        this.saldo -= valor;
        System.out.println("Saque de: " + valor + " realizado com sucesso, seu novo saldo é: "  + this.saldo);
    }
}

public void transfere (double valor, Conta destino) {

    if(valor > this.saldo) {

        System.out.println("Saldo insuficiente! seu saldo é: " + this.saldo);

    }else {        
        this.saldo -= valor;
        System.out.println("Transferencia de: " + valor + " realizada com sucesso! seu novo saldo é: "  + this.saldo);
        destino.saldo += valor;
    }
} 
    
}
