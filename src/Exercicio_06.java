import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
//  06 - Calcule o preço final com base no tipo de cliente (comum/premium).

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Cliente premium ou comum? (digite \"P\" para premium ou \"C\" para comum): ");
        String clientType = sc.next();

        switch (clientType.toUpperCase()){
            case "P" :
                System.out.println("Desconto de 10%");
                preco = preco - preco * 0.1;
                System.out.println("Subtotal da compra: " + preco );
                break ;
            case "C" :
                System.out.println("Desconto de 5%");
                preco = preco - preco * 0.05;
                System.out.println("Subtotal da compra: " + preco );
                break;
            default :
                System.out.println("opção inválida");
        }

    }

}
