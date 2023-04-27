package main;

import java.util.Collections;
import java.util.Scanner;

import model.CreditCard;
import model.Purchases;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limete do cartão: ");
        double limitOfCredit = scanner.nextDouble();
        CreditCard creditCard = new CreditCard (limitOfCredit);

        int out = 1;

        while(out != 0) {
            System.out.println("Digite a descrição da compra: ");
            String product = scanner.next();
            
            System.out.println("Digite o valor da compra: ");
            double value = scanner.nextDouble();

            Purchases purchases = new Purchases(product, value);
            boolean purchaseMade = creditCard.buy(purchases);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar comprando.");
                out = scanner.nextInt();

            } else {
                System.out.println("Saldo insuficiente!");
                out = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(creditCard.getPurchases());
        for (Purchases p : creditCard.getPurchases()) {
            System.out.println(p.getProduct() + " - " +p.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +creditCard.getBankroll());
     

    }

    
}
