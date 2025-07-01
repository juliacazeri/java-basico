import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, para criar a sua conta bancária insira os dados necessários.\n");

        System.out.println("Informe o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Informe o número da sua agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Informe o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o seu saldo bancário em R$: ");
        float saldoBancario = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.",
                nomeCompleto, numeroAgencia, numeroConta, saldoBancario);

        scanner.close();
    }
}