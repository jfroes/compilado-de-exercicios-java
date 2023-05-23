package br.com.alura.aplicacaodecompras.modelos;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while(sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra ");
            double valor = scanner.nextDouble();
            Compra compra = new Compra(descricao, valor);

            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scanner.nextInt();
            }else{
                System.out.println("saldo insuficiente");
                sair = 0;
            }

            System.out.println("*************************");
            System.out.println("Compras Realizadas: ");
            Collections.sort(cartao.getCompras());
            for (Compra c : cartao.getCompras()){
                System.out.println(c.getDescricao()+ " - " + c.getValorItem());
            }
            System.out.println("\n************************");
            System.out.println("\n Saldo do cartão: R$" + cartao.getSaldo());
        }
    }
}
