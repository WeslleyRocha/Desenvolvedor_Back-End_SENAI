
import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
        
        double num1 = 0, num2 = 0, operacao = 0;


        JOptionPane.showMessageDialog(null, "Bem vindo a calculadora do Wes! ");
        operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escola uma operação abaixo: \n" +
                                            "1 = Soma + \n" +
                                            "2 = Subtração - \n" +
                                            "3 = Multiplicação * \n" +
                                            "4 = Divisão / \n" +
                                            "5 = Sair "));

        if (operacao == 1) {
            
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número da Soma: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número da Soma: "));

            JOptionPane.showMessageDialog(null, "O resultado da Soma é: " + (num1 + num2));
        } else if (operacao == 2) {

            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número da Subtração: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número da Subtração: "));

            JOptionPane.showMessageDialog(null, "O resultado da Subtração é: " + (num1 - num2));
        } else if (operacao == 3) {
            
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número da Multiplicação: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número da Multiplicação: "));

            JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é: " + (num1 * num2));
        } else if (operacao == 4) {
            
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número da Divisão: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número da Divisão: "));

            JOptionPane.showMessageDialog(null, "O resultado da Divisão é: " + (num1 / num2));
        } else if (operacao == 5){
            
            System.exit(0);

        } else {
            
            JOptionPane.showMessageDialog(null, "Operação inválida! ");
        }
    }
}