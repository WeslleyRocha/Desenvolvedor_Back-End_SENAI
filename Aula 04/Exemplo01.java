
import java.util.Scanner;

public class Exemplo01{

public static void main(String[] args) {

        int idade = 0;

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite a idade do aluno: ");
        idade = ler.nextInt();

        if (idade >= 16) {
            System.out.println("O Aluno é maior de idade! ");
        } else {
            System.out.println("O Aluno é menor de idade! ");
        }

    }
}