public class Exemplos_Strings{

    public static void main (String[] args){

        String nome = "Teste de quantidade de caracter na string";

        // Length utilizado para contar a quantidade de caracter na string.
        System.out.println(nome.length());

        // Deixa todos os caracteres maiusculos.
        System.out.println(nome.toUpperCase());

        // Deixa todos os caracteres minusculo.
        System.out.println(nome.toLowerCase());

        //Padronizar os valores na variaveis.
        String nome2 = nome.toLowerCase();

        // Encontrar o caracter na posicão indicada.
        System.out.println(nome.charAt(10));

        // Encontrar uma substring
        System.out.println(nome.substring(5,10));

        //Ignorar caracteres maiuscula ou minuscula
        System.out.println(nome.equalsIgnoreCase(nome));


        //Verificando se contem a palavra
        System.out.println(nome.contains("a"));

        //Encontra a posicão no texto
        System.out.println(nome.indexOf("Teste"));
        System.out.println(nome.lastIndexOf("qualidade"));

        //Substituindo palavras com o metodo replace()
        System.out.println(nome.replace("na", "no"));

        //Convertendo INT para String
        int idade = 25;
        String texto = String.valueOf(idade);
        System.out.println("Sua idade: " + idade);
        
    }
    
}