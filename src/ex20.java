import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.print("Digite a unidade (C para Celsius ou F para Fahrenheit): ");
        char unidade = sc.next().toUpperCase().charAt(0);

        if (unidade == 'C') {
            double fahrenheit = (temperatura * 9 / 5) + 32;
            System.out.println(temperatura + "°C = " + fahrenheit + "°F");
        } else if (unidade == 'F') {
            double celsius = (temperatura - 32) * 5 / 9;
            System.out.println(temperatura + "°F = " + celsius + "°C");
        } else {
            System.out.println("Unidade inválida.");
        }

        sc  .close();
    }
}
