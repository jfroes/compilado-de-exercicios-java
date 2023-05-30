package br.com.alura;

import java.util.List;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Coleções", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Coleções", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 23));
        javaColecoes.adiciona(new Aula("Programção defensiva", 18));

        Aluno a1 = new Aluno("José Paulo", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Fernandes", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a-> System.out.println(a));

        System.out.println(javaColecoes.estaMatriculado(a1));
    }
}
