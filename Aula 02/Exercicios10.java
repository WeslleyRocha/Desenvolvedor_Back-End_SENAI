
import java.util.Scanner;

public class Exercicios10{
    public static void main (String[] args){


        // Exercicios10
        // Ler um número real e imprimir a terça parte deste número.

        double numero;
        double tercaParte;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        numero = ler.nextDouble();

        tercaParte = numero / 3;

        System.out.println("A terça parte do número digitado é: " + tercaParte);

    }
}