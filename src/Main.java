public class Main {
    public static void main(String[] args) {

        double nota1 = 8.5 , nota2 = 7.7;
        int media = (int) ((nota1 + nota2) / 2);
        System.out.println("A média das notas é: " + media);

        double varDouble = 12.34567;
        int varInt = (int) (varDouble);
        System.out.println(varInt);

        String frase = "Essa é a frase ";
        char caractere = 'X';
        System.out.println(frase + caractere);

        double precoProduto = 8.99;
        int quantidade = 4;
        System.out.println("O preço total é de: " + (precoProduto * quantidade));

        double valorEmDolares = 235.48;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.println(String.format("O valor em reais é de: R$%.2f",valorEmReais));

        double valorOriginal = 50;
        double percentualDesconto = 10;
        System.out.println(String.format("O valor original é de: R$%.2f. Já o valor depois do desconto de %.0f%% é de: R$%.2f", valorOriginal, percentualDesconto, valorOriginal - (valorOriginal * (percentualDesconto / 100))));
    }
}