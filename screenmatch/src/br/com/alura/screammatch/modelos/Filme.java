package br.com.alura.screammatch.modelos;

import br.com.alura.screammatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public Filme(String nome, int anoDeLacamento) {
        super(nome, anoDeLacamento);
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString(){
        return this.getNome() + " (" + this.getAnoDeLacamento() + ")";
    }
}
