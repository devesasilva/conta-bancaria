// Desafio Alura Java: criando sua primeira aplicacao
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados usuário:
        System.out.println("*********************************");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Tipo da conta: ");
        String tipoConta = scanner.nextLine();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("*********************************");

        // Menu de opções
        int opcao = 0;

        String menu = """
                1.Consulta de Saldo
                2.Receber Valor
                3.Transferir valor
                4.Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Receber valor");
                System.out.print("Valor a ser recebido: ");
                double valorReceber = scanner.nextDouble();
                saldo = saldo + valorReceber;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Transferir valor");
                System.out.print("Valor a ser transferido: ");
                double valorTransferir = scanner.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Saldo disponível é insuficiente para a transferência");
                } else {
                    saldo = saldo - valorTransferir;
                    System.out.println("Novo Saldo: " +  saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opçãp inválida");
            }
        }
    }
}
