package br.com.alura.aplicacaodecompras.modelos;

import java.util.Scanner;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valorItem;

    public Compra(String descricao, double valorItem){
        this.descricao = descricao;
        this.valorItem = valorItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorItem() {
        return valorItem;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valorItem = "+ valorItem;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorItem).compareTo(Double.valueOf(outraCompra.valorItem));
    }

    /*
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }
*/
}
