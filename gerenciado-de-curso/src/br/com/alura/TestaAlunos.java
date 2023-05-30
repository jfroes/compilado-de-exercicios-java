package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
       Set<String> alunos = new HashSet<>();

        alunos.add("José Paulo");
        alunos.add("Alberto Souza");
        alunos.add("Thommas Shelby");

        System.out.println(alunos);

        for(String aluno : alunos){
            System.out.println(aluno);
        }

        //todas as collections possuem o metodo contains
        boolean estaMatriculado = alunos.contains("José Paulo");

        System.out.println(estaMatriculado);

    }
}
