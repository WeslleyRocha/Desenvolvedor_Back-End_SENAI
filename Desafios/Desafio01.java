
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {


    // Fazer um script para calcular a folha de pagamento com o novo salário, baseado no aumento.
    // Se o salario for maior ou igual a R$:1.000,00 o aumento é de 40%.
    // Se for menor que R$: 1.000,00 o aumento é de 30%.

    double salarioBase = 1000.00;
    double salarioAtual = 0;
    double novoSalario = 0;

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o valor do salário atual: ");
    salarioAtual = ler.nextDouble();

    if (salarioAtual >= salarioBase ) {

        novoSalario = salarioAtual + salarioAtual * 0.4;
        System.out.println("O reaguste do seu salario é de 40%, o novo valor do seu salario será de R$:" + novoSalario);

    } else if (salarioAtual < salarioBase) {

        novoSalario = salarioAtual + salarioAtual * 0.3;
        System.out.println("O reaguste do seu salario é de 30%, o novo valor do seu salario será de R$:" + novoSalario);
        
    }
}
}