import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {
//  11- Verifique se três lados formam um triângulo equilátero, isósceles ou escaleno.


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double l1 = sc.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double l2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double l3 = sc.nextDouble();

        if(l1 == l2 && l1 == l3){
            System.out.println("este é um triângulo equilátero");
        }else if(l1 == l2 || l1 == l3 || l2 ==l3){
            System.out.println("este é um triângulo isósceles");
        }else{
            System.out.println("este é um triângulo Escaleno");
        }

        sc.close();
    }
}


