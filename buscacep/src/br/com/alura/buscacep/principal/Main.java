package br.com.alura.buscacep.principal;

import br.com.alura.buscacep.modelos.Endereco;
import br.com.alura.buscacep.modelos.GeradorDeArquivo;
import br.com.alura.buscacep.modelos.PesquisaCep;

import javax.sound.midi.SysexMessage;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do cep: ");
        String cep = scanner.next();

        PesquisaCep pesquisaCep = new PesquisaCep();
        try{
            Endereco endereco = pesquisaCep.buscaCep(cep);
            System.out.println(endereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.geraArquivoJson(endereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e);
            System.out.println("Finalizando a aplicação");
        }
    }
}