import java.time.LocalDateTime;

import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_16 {
//  16 - Simule um menu interativo com switch.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = false;

        StringBuilder sb = new StringBuilder();
        LocalDateTime lt = LocalDateTime.now();
        Locale brasil = new Locale("pt","BR");

        sb.append("_____MENU___");
        sb.append("\n1 - Que dia é hoje ?");
        sb.append("\n2 - Que horas são? ");
        sb.append("\n3 - Sair");

        System.out.println(sb);

        while(flag != true) {
            System.out.print("digite um numero: ");
            int numero = sc.nextInt();

            if (numero == 1) {
                System.out.println("hoje é " + lt.getDayOfMonth() + " de " + lt.getMonth().getDisplayName(TextStyle.FULL, brasil)  + " de " + lt.getYear());
            } else if (numero == 2){
                System.out.println("são "+ lt.getHour() + ":" + lt.getMinute());
            }else if (numero == 3){
                flag = true;
            }
            System.out.println(sb);
        }

        System.out.println("Saindo...");
        sc.close();
    }
}


