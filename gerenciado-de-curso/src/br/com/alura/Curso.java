package br.com.alura;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private int tempoTotal;
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

   //Devolve copia da lista "read only", Pra não deixar mexer nos metodos de modificar a lista
    //apenas de leitura, for each e etc
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
        this.tempoTotal += aula.getTempo();
    }

    public int getTempoTotal(){
        return this.tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", Tempo total: " + this.getTempoTotal() + "]"+
                " Aulas: " + this.aulas;
    }

    /*public int getTempoTotal(){
        int tempoTotal = 0;
        for(Aula aula : aulas){
            tempoTotal += aula.getTempo();
        }

        return tempoTotal;
    }*/


}

