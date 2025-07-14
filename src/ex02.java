import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite outro numero: ");
        double numero2 = sc.nextDouble();
        

        if(numero1 > numero2){
            System.out.print("O numero maior é:" + numero1);
        }else if(numero2 > numero1){
            System.out.print("O numero maior é:" + numero2);
        }else{
            System.out.print("São iguais");
        }
        sc.close();
    }
}
