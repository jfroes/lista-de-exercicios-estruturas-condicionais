import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_17 {
//  17 - Determine o maior de dois números usando Math.max().

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = sc.nextInt();

        System.out.println("O maior é " + Math.max(n1, n2));

        sc.close();
    }
}


