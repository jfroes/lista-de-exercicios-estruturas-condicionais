import java.util.Scanner;

public class Exercicio_20 {
//  20 - Simule uma calculadora básica (+, -, *, /) usando switch.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        boolean flag = true;


        while(flag) {

            System.out.print("Selecione uma operação (+, - , * . /): ");
            String oper = sc.next();

            int n1 = 0;
            int n2 = 0;

            if (oper.equalsIgnoreCase("+") || oper.equalsIgnoreCase("-") || oper.equalsIgnoreCase("*")  || oper.equalsIgnoreCase("/")){
                System.out.print("Entre com o primeiro algarismo: ");
                n1 = sc.nextInt();

                System.out.print("Entre com o segundo algarismo: ");
                n2 = sc.nextInt();
            }

            switch (oper) {
                case "+":
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case "-":
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case "*":
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case "/":
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
                default:
                    System.out.println("operação inválida");
            }

            System.out.print("Novo calculo? (S/N): ");
            oper = sc.next();

            flag = (oper.equalsIgnoreCase("S"))? true : false;

        }

        sc.close();
    }
}


