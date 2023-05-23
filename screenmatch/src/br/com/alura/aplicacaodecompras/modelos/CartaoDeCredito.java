package br.com.alura.aplicacaodecompras.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito{
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
     if(this.saldo >= compra.getValorItem()){
         this.saldo -= compra.getValorItem();
         this.compras.add(compra);
         return true;
     }else{
         return false;
     }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }




    /*   private double limiteCartao;

    public double getLimiteCartao() {
        return limiteCartao;
    }

    private void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public void defineLimiteCartao(){
        System.out.println("Digite o limite do cartão:");
        Scanner scanner = new Scanner(System.in);
        this.setLimiteCartao(scanner.nextDouble());
    }

    public void fazCompra(){
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a descrição do item: ");
            setItem(scanner.nextLine());

            System.out.println("Digite o valor do item");
            setValorItem(scanner.nextDouble());
            double limiteCartao = getLimiteCartao();

            if (getValorItem() <= this.limiteCartao){
                System.out.println("Compra realizada");
                this.limiteCartao -= getValorItem();
            }else {
                System.out.println("saldo insuficiente");
            }
            System.out.println(getLimiteCartao());
        }while (getLimiteCartao() >= 0);
    }*/
}
