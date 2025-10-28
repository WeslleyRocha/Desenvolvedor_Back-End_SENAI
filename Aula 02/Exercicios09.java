
import javax.swing.JOptionPane;

public class Exercicios09{

    public static void main (String[] args){

       // Exercicios09
        // Ler dois números inteiros e imprimir a soma. Antes do resultado,
        // deverá aparecer a mensagem: SOMA.

        int num1 = 0;
        int num2 = 0;
        int soma = 0;

       num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor para soma abaixo: "));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o seguundo valor para soma abaixo: "));


        JOptionPane.showInternalMessageDialog(null, "Estamos somando os numeros...");

        soma = num1 + num2;

        JOptionPane.showInternalMessageDialog(null, "O resultado dos valores somados é " + soma + ".");
    }

}