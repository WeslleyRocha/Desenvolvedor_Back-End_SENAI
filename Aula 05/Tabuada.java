
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) throws InterruptedException {

        int contador = 0;
        int numero = 0;
        int total = 0;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        numero = ler.nextInt();

        while (contador <= 10) {
            total = numero * contador;
            System.out.println(numero + " x " + contador + " = " + total);
            Thread.sleep(1500);
            contador++;
        }
    }
}