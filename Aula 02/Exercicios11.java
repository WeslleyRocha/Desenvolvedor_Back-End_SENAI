
import javax.swing.JOptionPane;

public class Exercicios11{

    public static void main(String[] args) {
        // Exercicios 11
            // Entrar com dois números reais e imprimir a média aritmética,
            // com a mensagem média antes do resultado.

        double num1 = 0;
        double num2 = 0;
        double media = 0;

        JOptionPane.showInternalMessageDialog(null, "Vamos calcular a média aritmética de dois números.");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor para calcular a média."));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor para calcular a média."));
        
        media = num1 + num2 / 2;
        
        JOptionPane.showInternalMessageDialog(null, "A media dos valores digitados é: " + media + " .");
    }
}