
import javax.swing.JOptionPane;

public class Desafio02 {
        public static void main(String[] args) {
        // A escola Tio Sam de Idiomas cobra as seguintes mensalidades dos alunos:
        // Nível 1 = R$ 51,50; Nível || = R$ 65,00; Nível III = R$ 80,00; Nível IV = R$ 100,00.
        // Para os alunos que pagam as mensalidades até o dia 1° de cada mês, tem um desconto de 15%, para os que pagam até dia 5, desconto de 10% e,
        // Para os que pagam até o dia 10 de cada mês, desconto de 3,89%. Monte uma script para saber o valor do desconto e valor final de cada mensalidade.

        int nivel = 0;
        int diaPagamento = 0;
        double valorMensalidade = 0;

        JOptionPane.showMessageDialog(null, "Bem-vindo à escola Tio Sam de Idiomas !");

        nivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha abaixo qual é o Nível o Idioma que vocé esta: \n" +
                                            "Nível 1  =   R$ 51,50  \n" +
                                            "Nível 2  =   R$ 65,00  \n" +
                                            "Nível 3  =   R$ 80,00  \n" + 
                                            "Nível 4  =   R$ 100,00" ));

        if (nivel == 1 ) {
            valorMensalidade = 51.50;

        } else if (nivel == 2 ) {
            valorMensalidade = 65.00;

        } else if (nivel == 3) {
            valorMensalidade = 80.00;
    
        } else if (nivel == 4) {
            valorMensalidade = 100.00;

        } else {
            JOptionPane.showMessageDialog(null, "Por favor digite de 1 até 4!" );
        }

        diaPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o dia do pagamento de sua mensalidade: "));

        if (diaPagamento == 1) {
            
            valorMensalidade = valorMensalidade - (valorMensalidade * 0.15);
            JOptionPane.showMessageDialog(null, "Mensalidades pagas ate dia 1° de cada mês, tem um desconto de 15%, seu pagamento sera de: " + valorMensalidade );

        } else if (diaPagamento >=2 && diaPagamento <=5 ) {
            
            valorMensalidade = valorMensalidade - (valorMensalidade * 0.10);
            JOptionPane.showMessageDialog(null, "Mensalidades pagas ate dia 5° de cada mês, tem um desconto de 10%, seu pagamento sera de: " + valorMensalidade  );

        } else if (diaPagamento >= 6 && diaPagamento <= 10) {
        
            valorMensalidade = (valorMensalidade * 3.89) -  valorMensalidade;
            JOptionPane.showMessageDialog(null, "Mensalidades pagas ate dia 10 de cada mês, tem um desconto de 3.89%, seu pagamento sera de: " + valorMensalidade );
        }   
    }
}