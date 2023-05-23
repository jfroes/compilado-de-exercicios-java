public class Conta {
    String nomeCliente;
    String tipoConta;
    float saldoConta;


    public void imprimeDadosConta() {
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Tipo Conta: " + this.tipoConta);
        System.out.println("Saldo: " + this.saldoConta);
    }

    public void depositaValor(float valor) {
        this.saldoConta += valor;
    }

    public void transfereValor(float valor, Conta c) {
        if (this.saldoConta >= valor) {
            this.saldoConta -= valor;
            c.saldoConta += valor;
        } else {
            System.out.println("Saldo insuficiente para a operação");
        }
    }
}
