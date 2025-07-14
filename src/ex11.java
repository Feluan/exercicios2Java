import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu sexo (F ou M): ");

        char sexo = sc.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M'){
            pesoIdeal = 72.7 * altura - 58;
            System.out.printf("peso ideal para homem %.2f kg%n", pesoIdeal);
        }else if (sexo =='F'){
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("peso ideal para mulher %.2f kg%n", pesoIdeal);
        }else{              
            System.out.println("Use as letras (F e M) maiusculas para funcionar.");
        }
        sc.close();
    }

}
