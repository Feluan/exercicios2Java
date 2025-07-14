import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triangulo: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o segundo lado do triangulo: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado do triangulo: ");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados NÃO podem formar um triângulo.");
        }
        sc.close();
    }
}
