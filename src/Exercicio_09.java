import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09 {
//  09 - Calcule o valor do ingresso de cinema com base na idade.


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorIngresso = 14.90;
        System.out.println("valor do ingresso para o cinema: R$" + valorIngresso);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 4 && idade <= 12){
            System.out.println("crianças até 12 anos tem 15% de desconto!");
            System.out.printf("Total: R$ %.2f", (valorIngresso -= valorIngresso * 0.15));
        }else if(idade > 12 && idade <= 59){
            System.out.printf("Total: R$ %.2f", (valorIngresso));
        }else  if(idade >= 60){
            System.out.println("idosos tem 50% de desconto!");
            System.out.printf("Total: R$ %.2f", (valorIngresso -= valorIngresso * 0.5));
        }

        sc.close();
    }
}

