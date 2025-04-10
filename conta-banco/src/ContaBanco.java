import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos inciar seu cadastro. Por favor digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite o número da sua agência:  (ex: 123-4)");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta:  (4 dígitos)");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo inicial: ");
        float saldo = scanner.nextFloat();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);

        conta.exibirDados();
        scanner.close();
    }
}
