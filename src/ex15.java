import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o codigo do lanche (1 a 5): ");
        int lanche = sc.nextInt();
        
        if (lanche == 1){
            System.out.println("Lanche 1, preço R$5,00");
        }else if (lanche == 2){
            System.out.println("Lanche 2, preço R$7,00");
        }else if (lanche == 3){
            System.out.println("Lanche 3, preço R$9,00");
        }else if (lanche == 4){
            System.out.println("Lanche 4, preço R$11,00");
        }else if (lanche == 5){
            System.out.println("Lanche 5, preço R$13,00");
        }else{
            System.out.println("Digite um codigo valido.");
        }
        sc.close();
    }
}
