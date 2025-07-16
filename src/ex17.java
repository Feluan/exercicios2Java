import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite seu salário: ");
        int valor = sc.nextInt();
        double bonus;

        if (valor > 2000){
            bonus = valor*0.10;
            System.out.printf("O valor do bônus é: %.2f%n",bonus);
        }else{
            bonus = valor*0.15;
            System.out.printf("O valor do bônus é: %.2f%n",bonus);
        }
        sc.close();
    }
}