import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        contaTerminal.numero = entrada.nextInt();

        System.out.print("Por favor, digite a Agência: ");
        contaTerminal.agencia = entrada.next();
        entrada.nextLine();
        System.out.print("Por favor, digite o nome do Cliente: ");
        contaTerminal.nomeCliente = entrada.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        contaTerminal.saldo = entrada.nextDouble();

        entrada.close();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                contaTerminal.nomeCliente, contaTerminal.agencia, contaTerminal.numero, contaTerminal.saldo));

    }
}
