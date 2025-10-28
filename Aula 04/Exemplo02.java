
import java.util.Scanner;

public class Exemplo02{

public static void main(String[] args) {

        int idade = 0;

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        if (idade <= 10) {
            System.out.println("Infantil! ");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("Juvenil! ");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("Adulto! ");
        }
    }
}