
import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        // Exercicios06
        // Ler dois números inteiros e imprimi-los.

        int numero1, numero2;
    
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primiero numero: ");
        numero1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = ler.nextInt();

        System.out.println("O 1º número digitado foi: " + numero1 + " E o 2º número digitdo é: " + numero2);
    }
}