public class OperadoresAritmeticosMath{

    public static void main (String[] args){
    
    double numero01 = 2025;
    double resultado;

    resultado = Math.sqrt(numero01); // Potência
    System.out.println("O valor da raiz quadrada do numero " + numero01 + " é: " + resultado);

    resultado = Math.pow(numero01, 2); // Potência
    System.out.println("A exponenciação de " + numero01 + "ao quadrado é: " + resultado);

    resultado = Math.log(numero01); // Logaritmo natural
    System.out.println("O logaritmo natural de " + numero01 + " é: " + resultado);

    resultado = Math.toRadians(numero01); // Converte graus para radianos
    System.out.println("O valor de " + numero01 + " é o graus em radianos é: " + resultado);
    }
}