package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Coleções", "Paulo Silveira");

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        //aulas.add(new Aula("Trabalhando com ArrayList", 21));



        System.out.println(javaColecoes.getAulas());

       // javaColecoes.getAulas().add(new Aula("trabalhando com arrays", 21));

        javaColecoes.adiciona(new Aula("Coleções", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 23));
        javaColecoes.adiciona(new Aula("Programção defensiva", 18));

        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);

        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
