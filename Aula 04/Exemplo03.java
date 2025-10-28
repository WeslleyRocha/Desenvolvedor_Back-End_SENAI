
import java.util.Scanner;

public class Exemplo03{
    public static void main(String[] args) {

        String str;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma letra A, B, C ou D: ");
        str = ler.nextLine();

        switch (str) {
            case "A", "a":
                System.out.println("Você digitou a letra A! ");
                break;
            
            case "B", "b":
                System.out.println("Você digitou a letra B! ");
                break;
            
            case "C", "c":
                System.out.println("Você digitou a letra C! ");
                break;
            
            case "D", "d":
                System.out.println("Você digitou a letra D! ");
                break;
            
            default:
                System.out.println("Letra inválida! ");
                break;
        }
    }
}