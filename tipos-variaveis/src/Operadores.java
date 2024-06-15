public class Operadores {

    public static void main(String[] args) {
        int numero = 5;

        //numero++; //numero = numero + 1;

        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);

        int a,b;
        a=6;
        b=5;
        String resultado = "";
        if(a == b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso";
        }

        System.out.println(resultado);

        String resultado2 = a > b ? "verdadeiro" : "falso";

        System.out.println(resultado2);

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadreiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das duas condições são verdadreiras");
        }
    }
}