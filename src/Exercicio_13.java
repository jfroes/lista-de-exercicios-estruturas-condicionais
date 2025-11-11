import java.util.Locale;
import java.util.Scanner;

public class Exercicio_13 {
//  13 - Use switch para determinar o mês do ano.


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um mes (1 - 12): ");
        int mes = sc.nextInt();

        switch(mes){
            case 1 :
                System.out.println("janeiro");
                break;

            case 2 :
                System.out.println("fevereiro");
                break;

            case 3 :
                System.out.println("março");
                break;

            case 4 :
                System.out.println("abril");
                break;

            case 5 :
                System.out.println("maio");
                break;

            case 6 :
                System.out.println("junho");
                break;

            case 7 :
                System.out.println("julho");
                break;

            case 8 :
                System.out.println("agosto");
                break;

            case 9 :
                System.out.println("setembro");
                break;

            case 10 :
                System.out.println("outubro");
                break;

            case 11 :
                System.out.println("novembro");
                break;

            case 12 :
                System.out.println("dezembro");
                break;
            default :
                System.out.println("mês inválido.");
        }


        sc.close();
    }
}


