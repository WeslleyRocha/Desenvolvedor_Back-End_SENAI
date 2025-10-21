
import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
        // Exercicios05
        // Ler um número inteiro e imprimi-lo.

        int numero = 0;

        Scanner ler = new Scanner(System.in);

        System.err.println("Digite um número inteiro:");
        numero = ler.nextInt();
       
        System.out.println("O número digitado é: " + numero);
    }
}