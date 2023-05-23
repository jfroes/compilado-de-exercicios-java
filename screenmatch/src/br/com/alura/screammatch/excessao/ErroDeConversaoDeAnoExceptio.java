package br.com.alura.screammatch.excessao;

public class ErroDeConversaoDeAnoExceptio extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExceptio(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
