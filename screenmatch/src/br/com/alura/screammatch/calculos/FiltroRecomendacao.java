package br.com.alura.screammatch.calculos;


public class FiltroRecomendacao {
    
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Preferidos do momento");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Muito bem avaliado");
        }else{
            System.out.println("Voce pode gostar");
        }
    }
}
