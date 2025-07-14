
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu turno (m, v, n), matutino, vespertino e noturno: ");
        char turno = sc.next().charAt(0);

        if (turno == 'm'){
            System.out.println("Bom dia!");
        }else if (turno == 'v'){
            System.out.println("Boa tarde!");
        }else if (turno == 'n'){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Digite minusculo e uma letra valida.");
        }
            sc.close();
    }
}
