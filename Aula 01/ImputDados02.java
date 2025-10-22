import java.util.Scanner;

public class ImputDados02{

public static void main (String[] args){

int numero1;
int numero2;
int total;

Scanner ler = new Scanner(System.in);
System.out.println("Digite o primeiro valor: ");
numero1 = ler.nextInt(); 


System.out.println("Digite o segundo valor: ");
numero2 = ler.nextInt();

total = numero1 + numero2;
System.out.println("O valor da sua soma é: " + total);

}

}