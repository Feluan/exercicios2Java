import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do seu mês de aniversário: ");
        int mes = sc.nextInt();


        if (mes == 1) {
            System.out.println("Seu signo é de Capricórnio");
        } else if (mes <= 2) {
            System.out.println("Seu signo é de Aquário");
        } else if (mes <= 3) {
            System.out.println("Seu signo é de Peixes");
        } else if (mes <= 4) {
            System.out.println("Seu signo é de Áries");
        } else if (mes <= 5) {
            System.out.println("Seu signo é de Touro");
        } else if (mes <= 6) {
            System.out.println("Seu signo é de Câncer");
        } else if (mes <= 7) {
            System.out.println("Seu signo é de Leão");
        } else if (mes <= 8) {
            System.out.println("Seu sigo é de Virgem");
        } else if (mes <= 9) {
            System.out.println("Seu signo é de Libra");
        } else if (mes <= 10) {
            System.out.println("Seu signo é de Escorpião");
        } else if (mes <= 11) {
            System.out.println("Seu signo é de Sagitário");
        } else if (mes <= 12) {
            System.out.println("Seu signo é de Capricórnio");
        }
        sc.close();
    }
}
