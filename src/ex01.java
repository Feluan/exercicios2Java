
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);


        System.out.print(("Digite um numero: "));
        double numero = sc.nextDouble();

        if (numero > 0){
            System.out.println("O numero é positivo");
        } else if (numero < 0){
            System.out.println("O numero é negativo");
        } else{
            System.out.println("O numero é zero");
        }
        sc.close();
    }
}
