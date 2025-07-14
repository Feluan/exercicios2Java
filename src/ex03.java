import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero: ");

        int numero = sc.nextInt();
        

        if(numero % 2 == 0){
            System.out.print("O numero é par");
        }else{
            System.out.print("O numero é impar");
        }
        sc.close();
    }
}
