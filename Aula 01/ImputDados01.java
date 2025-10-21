
import javax.swing.JOptionPane;

public class ImputDados01{

public static void main(String[] args) {
    
    int num1;
    int num2;
    int total;


    JOptionPane.showMessageDialog(null, "Vamos somar alguns numeros!");

    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo: "));

    total = num1+num2;

    JOptionPane.showMessageDialog(null, "Valor toal é: " + total);
    }

}