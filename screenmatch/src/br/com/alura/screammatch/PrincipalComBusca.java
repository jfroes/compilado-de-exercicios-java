package br.com.alura.screammatch;

import br.com.alura.screammatch.excessao.ErroDeConversaoDeAnoExceptio;
import br.com.alura.screammatch.modelos.Titulo;
import br.com.alura.screammatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme que quer buscar: ");
        String busca = scanner.next();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=fa3c615a";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        //Titulo titulo = gson.fromJson(json, Titulo.class);

        try{
            TituloOMDB tituloOMDB = gson.fromJson(json, TituloOMDB.class);
            Titulo titulo = new Titulo(tituloOMDB);
            System.out.println(titulo);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: " + e.getMessage());
        }catch(ErroDeConversaoDeAnoExceptio e) {
            System.out.println(e.getMessage());
        }

    }
}
