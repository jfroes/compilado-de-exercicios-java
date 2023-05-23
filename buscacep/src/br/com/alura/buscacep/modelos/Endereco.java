package br.com.alura.buscacep.modelos;

public record Endereco(String logradouro, String cep, String localidade,
                       String bairro, String uf) {
}
