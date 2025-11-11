import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {
//  12- Calcule o bônus de um funcionário com base no tempo de empresa.


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos há anos voce está na empresa: ");
        int anos = sc.nextInt();

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        if (anos >= 2 && anos < 5){
            salario = salario + salario * 0.2;
            System.out.printf("Seu bonus é de 20%%: R$ %.2f", salario);

        }else if(anos >= 5 && anos < 10){
            salario = salario + salario * 0.4;
            System.out.printf("Seu bonus é de 40%%: R$ %.2f", salario);

        } else if (anos >= 10) {
            salario = salario + salario * 0.6;
            System.out.printf("Seu bonus é de 60%%: R$ %.2f", salario);
        }

        sc.close();
    }
}


