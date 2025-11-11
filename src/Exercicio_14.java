import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14 {
//  14 - Mostre se um número é divisível por 2, 3 ou 5.


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("digite um numero: ");
        int numero = sc.nextInt();


        if(numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0){
            System.out.println(numero + " é divisivel por: 2, 3 e 5");
        }else if(numero % 2 == 0 && numero % 3 == 0){
            System.out.println(numero + "  divisivel por: 2, 3 ");
        }else if(numero % 2 == 0 && numero % 5 == 0 ){
            System.out.println(numero + " é divisivel por: 2, 5 ");
        }else if(numero % 5 == 0 && numero % 3 == 0){
            System.out.println(numero + " é divisivel por: 3, 5");
        }else if(numero % 2 == 0){
            System.out.println(numero + " é divisivel por: 2");
        }else if(numero % 3 == 0){
            System.out.println(numero + " é divisivel por: 3");
        }else if(numero % 5 == 0){
            System.out.println(numero + " é divisivel por: 3");
        }



            sc.close();
    }
}


