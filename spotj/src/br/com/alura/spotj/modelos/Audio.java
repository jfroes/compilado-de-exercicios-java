package br.com.alura.spotj.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int totalDecurtidas;
    private double classificacao;

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    //Getters

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao(){
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDecurtidas(){
        return totalDecurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    //Metodos
    public void curte(){
    totalDecurtidas++;
    }

    public void reproduz(){
        totalDeReproducoes++;
    }
}

