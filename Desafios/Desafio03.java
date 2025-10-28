public class Desafio03 {
        public static void main(String[] args) {
       
        // NO AutoPosto Enche o Tanque, cobram-se os seguintes preços de combustíveis com prazo de 20 dias: Gasolina comum = R$: 2,992;
        // Alcool = R$: 2,1092; Diesel = R$: 2,28; Gasolina aditivada = R$: 3,054. Para pagamentos à vista, tem-se um desconto de 5,3% e 
        // para cheques pré-datados acima de 21 dias, cobra-se um acrescimo de 8,9%. Monte um script para calcular o valor do combustível
        // a vista e à prazo.

        double gasolinaComum = 2.992;
        double alcool = 2.1092;
        double diesel = 2.28;
        double gasolinaAditivada = 3.054;
        double valorCombustivel = 0;


        int tipoCombustivel = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(
            "Escolha o tipo de combustível: \n \n" +
            "1 - Gasolina comum = R$:2.992\n" +
            "2 - Álcool = R$: 2,1092 \n" +
            "3 - Diesel = R$:2,28 \n" +
            "4 - Gasolina aditivada = R$:3,054  \n "
        ));

        
        switch (tipoCombustivel) {
            case 1:
                 valorCombustivel = gasolinaComum;
                break;

            case 2:
                 valorCombustivel = alcool; 
                break;

            case 3:
                 valorCombustivel = diesel;
                break;

            case 4:
                 valorCombustivel = gasolinaAditivada;
                break;        
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "Tipo de combustível inválido!");
                throw new AssertionError();
        }

            int tipoPagamento = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(
                "Escolha o tipo de pagamento: \n" +
                "1 - PIX\n" +
                "2 - Cartão\n" +
                "3 - Dinheiro \n" +
                "4 - Cheque" )
                );

                switch (tipoPagamento) {
                    case 1,2, 3:
                        valorCombustivel = valorCombustivel - (valorCombustivel * 0.053);
                        javax.swing.JOptionPane.showMessageDialog(null, "Para este tipo de pagamento, tem-se um desconto de 5,3%, o valor final do combustível será de: R$" + valorCombustivel);
                        break;

                    case 4:
                        valorCombustivel = valorCombustivel + (valorCombustivel * 0.089);
                        javax.swing.JOptionPane.showMessageDialog(null, "Para este tipo de pagamento, tem-se um acréscimo de 8,9%, o valor final do combustível será de: R$" + valorCombustivel);
                        break;

                    default:
                        javax.swing.JOptionPane.showMessageDialog(null, "Tipo de pagamento inválido!");
                        break;
                }
       
    }
}