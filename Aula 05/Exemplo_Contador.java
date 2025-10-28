public class Exemplo_Contador {
    public static void main(String[] args) throws InterruptedException {
        
        // Exemplo de um contador regressivo de 10 até 0
        int contador = 0;

        while (contador <=5) {
            System.out.println("Volta: " + contador);

            Thread.sleep(1000); // Pausa de 1 segundo

            contador++; 
       }
         System.out.println("FIM!");

    }
}