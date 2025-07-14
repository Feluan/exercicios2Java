import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 12){
            System.out.println("Você é criança");
        }else if (idade <= 17){
            System.out.println("Você é adolecente");
        }else if (idade <= 59){
            System.out.println("Você é adulto");
        }else if (idade >= 60){
            System.out.println("Você é idoso");
        }
        sc.close();
    }
}
