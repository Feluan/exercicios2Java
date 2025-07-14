import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < num; i++) {
                primo = false;
                break;
            }
        }
        if (primo){
            System.out.println(num+" é primo");
        }else{
            System.out.println(num+" nao é primo");
        }
        sc.close();
    }
}
