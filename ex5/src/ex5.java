import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        float salario = 1800.00f;
        float comissao = 150.00f;


        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade de produtos vendidos: ");
        int produtos = sc.nextInt();
;
        System.out.print("Valor Total das Vendas: R$");
        float totalvendas = sc.nextFloat();



        float vendas = totalvendas * 0.03f;
        float comissaof = produtos * comissao;
        float salariof = vendas + salario + comissaof;

        System.out.print(nome); System.out.print(" seu salário final é de: R$"); System.out.print(salariof);

    
        




        
    }
}
