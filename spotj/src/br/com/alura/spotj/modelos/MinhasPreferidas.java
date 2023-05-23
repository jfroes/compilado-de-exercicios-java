package br.com.alura.spotj.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é Top do momento");
        }else {
            System.out.println(audio.getTitulo() + " é Uma boa opção para mais tarde");
        }
    }
}
