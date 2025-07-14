import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o numero que você quer ver por extenso (1 ao 5): ");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("Um");
        }else if(num == 2){
            System.out.println("Dois");
        }else if (num == 3){
            System.out.println("Três");
        }else if (num == 4){
            System.out.println("Quatro");
        }else if (num == 5){
            System.out.println("Cinco");
        }else{
            System.out.println("Digite um numero válido.");
        }
        sc.close();
    }
}
