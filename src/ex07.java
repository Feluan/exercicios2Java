import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro numero: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite uma operação (+, -, *, /)");
        char operacao = sc.next().charAt(0);

        double resultado;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                operacaoValida = false;
                resultado = 0;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Operação inválida");
        }

        sc.close();
    }
}
