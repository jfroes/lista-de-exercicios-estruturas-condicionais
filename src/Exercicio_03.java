import java.util.Scanner;

public class Exercicio_03 {
//  03 - Mostre o maior entre três números.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n2){
            System.out.println(n1 + " é o maior");
        }else if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " é o maior");
        }else{
            System.out.println(n3 + " é o maior");
        }


        sc.close();
    }

}
