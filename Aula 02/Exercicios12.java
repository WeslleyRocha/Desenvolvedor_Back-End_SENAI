
import javax.swing.JOptionPane;

public class Exercicios12{

    public static void main (String [] arg){

        // Exercicios12
            // Entrar com dois números inteiros e imprimir a seguinte saída:
            // dividendo:
            // divisor:
            // quociente:
            // resto:

            int dividendo = 0;
            int divisor = 0;
            int quociente = 0;
            int resto = 0;

            JOptionPane.showMessageDialog(null, "Vamos calcular dois números inteiros!");

        
            dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do dividendo para calcular: "));
            divisor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do divisor para calcular: "));

            quociente = dividendo / divisor;
            resto = dividendo % divisor;

            JOptionPane.showMessageDialog(null, "Dividendo: " + dividendo + "\n" +
                                                "Divisor: " + divisor + "\n" +
                                                "Quociente: " + quociente + "\n" +
                                                "Resto: " + resto);
    }
}