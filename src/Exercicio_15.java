import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15 {
//  14 - Determine se um número é primo.


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean flag = false;

        while(flag != true) {
            System.out.print("digite um numero: ");
            int numero = sc.nextInt();

            if (numero > 1 && numero % numero == 0) {
                System.out.println("esse número é primo");
            } else {
                System.out.println("esse número não é primo");
            }

            System.out.print("Sair? (S/N): ");
            String sair = sc.next();

            flag = (sair.equalsIgnoreCase("S")) ? true : false;
        }

        System.out.println("Saindo...");
        sc.close();
    }
}


