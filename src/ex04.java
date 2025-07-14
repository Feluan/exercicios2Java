import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite sua primeira nota: ");
        double media1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double media2 = sc.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        double media3 = sc.nextDouble();
        System.out.print("Digite sua quarta nota: ");
        double media4 = sc.nextDouble();

        double media = (media1 + media2 + media3 + media4) / 4;

        if(media >= 7){
            System.out.println("Você foi aprovado!!");
        }else if (media < 5){
            System.out.println("Você esta de recuperação");
        }else{
            System.out.println("Você esta de exame");
        }
        sc.close();
    }
}
