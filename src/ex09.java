import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else if ((letra >= 'a' && letra <= 'z')) {
            System.out.println("A letra " + letra + " é uma consoante.");
            sc.close();
        }

    }
}
