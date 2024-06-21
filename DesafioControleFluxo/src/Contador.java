import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();

        try {
            
            contar(valor1, valor2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }finally{
            entrada.close();
        }
        
    }

    static void contar(int valor1, int valor2) throws ParametrosInvalidosException{

        if(valor1 > valor2){
            throw new ParametrosInvalidosException();
        }

        for(int i = 1; i <= (valor2-valor1); i++){
            System.out.println("Imprimindo o número " + i);
        }

    }
}
