
import java.util.Scanner;

public class Exemplo04{
    public static void main(String[] args) {

        int ano, numero;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um Numero:");
        numero = ler.nextInt();

        System.out.println("Digite um Ano:");
        ano = ler.nextInt();

        switch (numero) {
            case 1:
                if ((2025 - ano) >= 20){
                    System.out.println("Vocé é quarentão! ");
                }
                break;
            
            case 2:
                System.out.println("Vocé é novinho! ");
                break;
            
            default:
                System.out.println("Número inválido! ");
                break;
        }
    }
}