package br.com.alura.screammatch.principal;

import br.com.alura.screammatch.modelos.Filme;
import br.com.alura.screammatch.modelos.Serie;
import br.com.alura.screammatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso Chefão", 1972);
        Filme filme2 = new Filme("Panico", 1992);
        Filme filme3 = new Filme("Evil Dead", 1981);
        Serie serie1 = new Serie("Better Call Saul", 2015);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        /*for (Titulo item : lista) {
            System.out.println(item);
        }*/

        //forEach com expressão lambda
        lista.forEach(item -> System.out.println(item));

        //forEach com expressão Lambda reduzida
        lista.forEach(System.out::println);

        //Exemplo de uso de Colletions para ordenar uma lista em ordem alfabetica.
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("José");
        nomes.add("Juliane");
        nomes.add("Melissa");
        nomes.add("Manoel");
        nomes.add("Kassab");
        nomes.add("Mariana");

        Collections.sort(nomes);

        System.out.println(nomes);

        //ordenando a lista de filmes após implementar a interface Comparable na classe Titulo
        Collections.sort(lista);
        System.out.println(lista);

        //Listando os titulos por ordem alfabetica e ano de laçamento usando expressoes lambda
        //Sort é um comparador e não um comparavel como fizemos na classe titulo
        lista.sort(Comparator.comparing(Titulo::getAnoDeLacamento));
        System.out.println(lista);

    }
}
