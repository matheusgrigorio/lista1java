import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = sc.nextInt();

        System.out.print("n2: ");
        int n2 = sc.nextInt();
        
        
        System.out.println("Valor antes da troca: ");System.out.println(n1); System.out.println(n2);

        int n3 = n1;

        n1 = n2;

        n2 = n3;

        
        System.out.println("Valor depois da troca: "); System.out.println(n1); System.out.println(n2);
    }
}
