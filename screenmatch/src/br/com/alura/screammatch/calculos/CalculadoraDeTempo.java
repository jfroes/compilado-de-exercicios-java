package br.com.alura.screammatch.calculos;

import br.com.alura.screammatch.modelos.Titulo;


public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {

        return this.tempoTotal;
    }

    public void inclui(Titulo t){

        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
