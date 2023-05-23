package br.com.alura.screammatch.principal;

import br.com.alura.screammatch.modelos.Episodio;
import br.com.alura.screammatch.modelos.Filme;
import br.com.alura.screammatch.modelos.Serie;
import br.com.alura.screammatch.calculos.CalculadoraDeTempo;
import br.com.alura.screammatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        Filme filme1 = new Filme("O Poderoso Chefão",1972);
        filme1.setDiretor("Francis Ford Coppola");
        filme1.setDuracaoEmMinutos(175);

        filme1.avalia(10);
        filme1.avalia(8.5);
        filme1.avalia(9.8);
        filme1.exibeFichaTecnica();

        Filme filme2 = new Filme("Panico 1",1992);
        filme2.setDiretor("Wes Craven");
        filme2.setDuracaoEmMinutos(111);
        filme2.exibeFichaTecnica();

        Filme filme3 = new Filme("Evil Dead", 1981);
        filme3.setDiretor("Sam Raimi");
        filme3.setDuracaoEmMinutos(85);
        filme3.exibeFichaTecnica();

        // System.out.println(filme1.somaDasAvaliacoes);
        // System.out.println(filme1.totalDeAvaliacoes);
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());


        Serie serie = new Serie("Better Call Saul", 2015);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(58);
        System.out.println("Para Maratonar leva: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme1);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
    }
}
