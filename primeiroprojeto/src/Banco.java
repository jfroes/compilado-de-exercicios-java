import java.util.Scanner;

public class Banco {

    public boolean menuBanco(Conta conta) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ****************
                Operações:
                                
                1 - Consultar Saldo
                2 - Depositar
                3 - Transferência
                4 - Sair
                                
                """);
        System.out.println("Digite uma opção:");
        int opcaoOperacao = scanner.nextInt();

        switch (opcaoOperacao) {
            case 1:
                conta.imprimeDadosConta();
                return false;
            case 2:
                System.out.println("Digite o valor a ser depositado: ");
                conta.depositaValor(scanner.nextFloat());
                return false;
            case 3:
                System.out.println("Digite o valor a ser transferido: ");
                conta.transfereValor(scanner.nextFloat(), conta);
                return false;
            case 4:
                System.out.println("Obrigado por utilizar  o sistema do banco!");
                return true;
            default:
                System.out.println("Opção inválida!");
                return false;
        }
    }
}


