import java.util.Scanner;

public class Exercicio_04 {
//  04 - Verifique se o ano é bissexto

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int year = sc.nextInt();

        if ((year % 4) == 0 ){
            System.out.println(year + " é um ano bissexto");
        }else{
            System.out.println(year + " não é um ano bissexto");
        }


    }

}
