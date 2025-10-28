
import javax.swing.JOptionPane;

public class Exercicios08{

    public static void main (String[] args){

        // Exercicios08
        // Ler nome, endereço e telefone e imprimi-los.

        String nome;
        String endereco;
        String telefone;


        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
        telefone = JOptionPane.showInputDialog("Digite seu telefone: ");


        JOptionPane.showMessageDialog(null, "O nome digitado foi: " + nome + ", seu endereço é: " 
                                        + endereco + " , e o telefone " +  telefone + ".");

    }
}