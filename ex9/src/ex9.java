import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        System.out.print("Horas: ");
        int horas = sc.nextInt();
        
        int seg = horas * 3600;
        int min = horas * 60; 

        System.out.println("O valor em seg:"); System.out.println(seg);
        System.out.println("O valor em min:"); System.out.println(min);




    }
}
