import java.util.Scanner;

public class Exercicio_05 {
//  05 - Exiba o dia da semana com base em um número (1 a 7).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int n = sc.nextInt();

        switch (n){
            case 1 :
                System.out.println("segunda-feira");
                break;
            case 2 :
                System.out.println("terça-feira");
                break;
            case 3 :
                System.out.println("quarta-feira");
                break;
            case 4 :
                System.out.println("quinta-feira");
                break;
            case 5 :
                System.out.println("sexta-feira");
                break;
            case 6 :
                System.out.println("sábado");
                break;
            case 7 :
                System.out.println("domingo");
                break;
            default :
                System.out.println("Dia inválido");
        }

    }

}
