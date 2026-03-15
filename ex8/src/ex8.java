import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        System.out.println("Distancia percorrida(km): ");
        float km = sc.nextFloat();

        System.out.println("Informe a quantidade combustivel em litros: ");
        int litros = sc.nextInt();

        float cm = km/litros;

        System.out.print("O consumo médio do veículo é: "); System.out.println(cm);






    }

}
