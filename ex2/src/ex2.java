import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n1: ");
        int n1 = sc.nextInt();

        System.out.println("Digite n2: ");
        int n2 = sc.nextInt();

        //Soma
        int soma = n1 + n2;
        
        System.out.print("A soma dos dois numeros é: "); System.out.println(soma);

        //Multiplicacao
        int mul = n1 * n2;
        System.out.print("A multiplicação dos dois numeros é: "); System.out.println(mul);

        //Subtração
        int sub  = n1 - n2;
        System.out.print("A subtração dos dois numeros é: "); System.out.println(sub);

        //Divisão
        int div = n1 / n2;
        System.out.print("A divisão é: "); System.out.println(div);
    
    }
}
