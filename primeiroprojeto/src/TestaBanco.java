import java.util.Scanner;

public class TestaBanco {
    public static void main(String[] args) {

        boolean rodaSistema = false;

        Conta conta1 = new Conta();

        conta1.nomeCliente = "José";
        conta1.tipoConta = "Conta Corrente";
        conta1.saldoConta = 50;

        Conta conta2 = new Conta();

        conta2.nomeCliente = "Manoel Gomes";
        conta2.tipoConta = "Conta Linda Demaize";
        conta2.saldoConta = 100;

        Banco banco = new Banco();

        while(banco.menuBanco(conta2) == false){
            banco.menuBanco(conta2);
            }


    }
}
