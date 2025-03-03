import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = entrada.next();

        System.out.println("Por favor, digite o seu saldo atual: ");
        double saldo = entrada.nextDouble();

        System.out.println("Por favor, digite o número da sua conta: ");
        int id_conta = entrada.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, id_conta, saldo);


        entrada.close();
    }
}
