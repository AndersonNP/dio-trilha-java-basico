import java.util.Scanner;

public class App {
    static double saldo = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    depositar(scanner);
                    break;
                case 2:
                    sacar(scanner);
                    break;
                case 3:
                    saldo();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
    
    static void depositar(Scanner scanner){
      double deposito = scanner.nextDouble();
      saldo += deposito;
      System.out.println(String.format("Saldo atual: %.1f", saldo));
    }
    
    static void sacar(Scanner scanner){
      double saque = scanner.nextDouble();
      if(saque > saldo){
        System.out.println("Saldo insuficiente");
        return;
      }
      saldo -= saque;
      System.out.println(String.format("Saldo atual: %.1f", saldo));
    }
    
    static void saldo(){
      System.out.println(String.format("Saldo atual: %.1f", saldo));
    }
}