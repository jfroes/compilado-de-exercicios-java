package br.com.alura.screammatch.modelos;

import br.com.alura.screammatch.excessao.ErroDeConversaoDeAnoExceptio;

public class Titulo implements Comparable<Titulo>{
    private  String nome;
    private int anoDeLacamento;
    private  boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private  int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLacamento){
        this.nome = nome;
        this.anoDeLacamento = anoDeLacamento;
    }

    public Titulo(TituloOMDB tituloOMDB) {
        if (tituloOMDB.year().length() > 4){
            throw new ErroDeConversaoDeAnoExceptio("Não consegui converter o ano " +
                    "porque tem mais de 4 caracteres");
        }
        this.nome = tituloOMDB.title();
        this.anoDeLacamento = Integer.valueOf(tituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOMDB.runtime().substring(0,3));
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public int getAnoDeLacamento(){
        return anoDeLacamento;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLacamento(int anoDeLacamento){
        this.anoDeLacamento = anoDeLacamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    //Metodos

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Titulo: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLacamento);
        System.out.println("Duração: " + this.duracaoEmMinutos + " minutos\n");
    }

    public  void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){

        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return this.getNome() +" ("+ this.getAnoDeLacamento() +") " + this.getDuracaoEmMinutos() + " min";
    }
}
