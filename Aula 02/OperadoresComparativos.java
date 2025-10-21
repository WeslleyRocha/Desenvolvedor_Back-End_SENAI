public class OperadoresComparativos {

    public static void main (String[] args){

        int numero01 = 5;
        int numero02 = 10;
        boolean resultado;

        //Igualdade
        resultado = (numero01 == numero02);
        System.out.println("O resultado da igualdade é: " + resultado);

        //Diferença
        resultado = (numero01 != numero02);
        System.out.println("O resultado da diferença é: " + resultado);

        //Maior que
        resultado = (numero01 > numero02);
        System.out.println("O resultado do maior que é: " + resultado);

        //Menor que
        resultado = (numero01 < numero02);
        System.out.println("O resultado do menor que é: " + resultado);

        //Maior ou igual a
        resultado = (numero01 >= numero02);
        System.out.println("O resultado do maior ou igual a é: " + resultado);

        //Menor ou igual a
        resultado = (numero01 <= numero02);
        System.out.println("O resultado do menor ou igual a é: " + resultado);
        
    }

}