import java.util.Scanner;

public class Exercicio_19 {
//  19 - Verifique se uma senha digitada está correta.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativas = 3;

        System.out.print("defina uma senha: ");
        String password = sc.next();

        while (tentativas > 0 ) {

            System.out.print("digite sua senha senha: ");
            String attempt = sc.next();


            if (attempt.equals(password)) {
                System.out.println("Login efetuado com sucesso");
                break;
            } else{
                System.out.println("Senha incorreta. Voce ainda tem " + tentativas+  " tentativas");
                tentativas--;
            }
        }

        sc.close();
    }
}


