import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
//  07 - Mostre “Bom dia”, “Boa tarde” ou “Boa noite” de acordo com a hora.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite um horário (formato 24h): ");
        LocalTime time = LocalTime.parse(sc.next(), df);


        if (time.getHour() >= 00 && time.getHour() < 05 || time.getHour() >=18) {
            System.out.println("Boa noite");
        }else if(time.getHour() >= 05 && time.getHour() < 12){
            System.out.println("Bom dia");
        }else if (time.getHour() >= 12 && time.getHour() < 18){
            System.out.println("Boa tarde");
        }

        sc.close();
    }
}

