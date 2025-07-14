
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else if (num2 < num3) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else {
                System.out.println("Você digitou numeros incoerentes");
            }
        } else if (num2 > num1) {
            if (num1 >= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else if (num1 < num3) {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            } else {
                System.out.println("Você digitou numeros incoerentes");
            }
        }
        sc.close();
    }
}
