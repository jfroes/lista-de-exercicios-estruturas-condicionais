import java.util.Scanner;

public class Exercicio_02 {
//  02 - Receba uma nota e exiba “Aprovado” se ≥ 7, senão “Reprovado”.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        int n = sc.nextInt();

        if ( n >= 7 ){
            System.out.println("nota " + n + " : Aprovado!");
        }else {

            System.out.println("nota " + n + " : Reprovado!");
        }
        sc.close();
    }

}
