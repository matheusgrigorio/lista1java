
import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o peso(kg): ");
        float peso = sc.nextFloat(); 

        System.out.print("Informe a altura: ");
        float alt = sc.nextFloat();

        float imc = peso / (alt * alt);

        System.out.print(imc);
    }
}
