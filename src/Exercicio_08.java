import java.util.*;

public class Exercicio_08 {
//  08 - Verifique se uma letra é vogal ou consoante.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> vogais = List.of("a", "e", "i", "o", "u");

        System.out.print("Digite uma letra: ");
        String letra = sc.next();

        if (vogais.contains(letra)){
            System.out.println(letra + " letra é vogal");
        }else{
            System.out.println(letra + " letra é consoante");
        }
        sc.close();
    }
}

