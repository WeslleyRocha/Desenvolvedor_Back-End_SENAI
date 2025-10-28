
import java.util.Scanner;

public class Guardar_Numeros{
    public static void main(String[] args) {
        int contador = 0;
        int acumulador = 0;
        int numero = 0;

        Scanner ler = new Scanner(System.in);

        while (contador <= 5) {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();
            acumulador = acumulador + numero;
            contador++;
        }
        System.out.println("A soma dos números é: " + acumulador);
    }

}