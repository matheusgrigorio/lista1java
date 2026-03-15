import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = sc.nextInt();

        int d4 = n1 % 10;
        int d3 = n1 %100;
        d3 = d3 / 10;

        int d2 = n1 % 1000;
        d2 = d2/10;
        d2 = d2/10;

        int d1 = n1 / 1000;

        System.out.print(d4);
        System.out.print(d3);
        System.out.print(d2);
        System.out.print(d1);

    }
}
