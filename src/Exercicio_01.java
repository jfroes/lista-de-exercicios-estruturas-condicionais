import java.util.Scanner;

public class Exercicio_01 {
//  01 -   Verifique se um número é positivo, negativo ou zero.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if ( n > 0 ){
            System.out.println(n + " é positivo");
        }else if(n < 0) {
            System.out.println(n + " é negativo");
        }else{
            System.out.println("zero");
        }

        sc.close();
    }

}
