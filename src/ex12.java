import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresso custa R$50, digite sua idade: ");
        int idade = sc.nextInt();
        int desconto;

        if (idade >= 60){
            desconto = 50/2;
            System.out.println("Como você tem 60+ pagará apenas meia entrada R$"+desconto);
        }else{
            System.out.println("Você pagará R$50.");
        }
        sc.close();
    }
}
