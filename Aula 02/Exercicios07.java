
import javax.swing.JOptionPane;

public class Exercicios07 {
    public static void main(String[] args) {
        // Exercicios07
        // Ler um número inteiro e imprimir seu sucessor e seu antecessor.

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para saber o sucessor e seu antecessor !"));

        JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + ". O sucessor é deste número é: " + (numero + 1) 
                                        + " e o antecessor é: " + (numero - 1));
    }
}