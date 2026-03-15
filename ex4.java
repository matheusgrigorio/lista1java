import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Salario: ");
        float salario = sc.nextFloat();

        float aumento = salario * (15.0f/100);
        float nvsalario = aumento + salario;

        System.out.print("Novo salario: R$"); System.out.print(nvsalario);
        
    }
}
