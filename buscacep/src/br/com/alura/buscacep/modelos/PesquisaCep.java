package br.com.alura.buscacep.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PesquisaCep {

    private String cep;
    private String url;


    public void entraCep() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        String cep = scanner.next();
        this.cep = cep;
    }

    public Endereco buscaCep(String cep){
        URI endereco = URI.create("https://viacep.com.br/ws/" +cep+"/json/");

        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request,
                    HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse cep");
        }

    }
}
