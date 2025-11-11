import java.util.Scanner;

public class Exercicio_18 {
//  18 - Verifique se um aluno pode fazer recuperação (nota entre 4 e 6).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        int n = sc.nextInt();

        if (n >=4  && n < 6){
            System.out.println("Pode faze recuperação");
        } else if (n >= 6) {
            System.out.println("Passou de ano!");
        }else {
            System.out.println("Reprovado");
        }


        sc.close();
    }
}


