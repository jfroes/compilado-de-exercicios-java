package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com cursos e sets";

        List<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aula: " + aulas.get(i));
        }

        //For each com expressao Lambda
        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " + aula);
        });

        aulas.add("Aumentando o nosso conhecimento");
        aulas.add("Situações de desafio");
        aulas.add("Categorias de ensino");

        Collections.sort(aulas);
        System.out.println(aulas);
        
    }
}