import java.util.Scanner;

import Model.Cliente;
import Model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
       Cliente cliente = new Cliente("Leonardo Gomes Teste", "123.456.789-10", "Programador Java", 5000, "Conta Corrente");
       Conta conta = new Conta(123, 321, 2500, cliente);

       Cliente outroCliente = new Cliente("Italo Alves", "000.000.000-00", "Conta Poupanca");
       Conta outraConta = new Conta(456, 561, 0, outroCliente);

       Scanner leitura = new Scanner(System.in);        
       int escolha = 0;
       double insere = 0;

       String mensagem = """ 
        ***********************

        Dados iniciais do cliente:

        Nome: %s.
        Tipo conta: %s.
        Saldo inicial: R$ %.2f.
        ***********************
        """.formatted(cliente.getNome(), cliente.getTipoConta() , conta.getSaldo() );
       System.out.println(mensagem);

       String menu = """ 

        Operações

        1- Consultar saldos
        2- Depositar
        3- Transferir
        4- Sacar
        5- Sair
        Digite a opção desejada:
        """;


       


       while (escolha != 5) {
        System.out.println(menu);
        escolha = leitura.nextInt();

      //1- Consultar saldos
       if (escolha==1) {
        System.out.println("O saldo atual é: " +  conta.getSaldo());
       }     

       //2- Depositar

       if (escolha == 2) {

        System.out.println("Quanto você deseja depositar? ");

        insere = leitura.nextDouble();
        conta.deposita(insere);        
       }

       //3- Transferir

       if(escolha == 3) {      

        System.out.println("Quanto você deseja transferir? ");
        insere = leitura.nextDouble();
        conta.transfere(insere, outraConta);   
       }

       //4- Sacar

       if(escolha == 4) {
        System.out.println("Quanto você deseja sacar? ");
        insere = leitura.nextDouble();
        conta.saca(insere);
       } else if (escolha > 5 || escolha < 0 ) {
        System.out.println("Opção inválida!");
      }
        


    }
  } 
}
