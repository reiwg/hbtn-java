package numeros;

// Escreva um código em java que imprima os números de 0 a 99.

//     A classe deve se chamar Numeros0a99
//     Os números devem estar separados por , seguido por um espaço
//     Os números devem ser impressos em ordem crescente
//     O último número deve ser seguido por um nova linha
//     Você não pode utilizar System.out.print mais do que duas vezes
//     Você pode utilizar apenas uma instrução de repetição em seu código.

public class Numeros0a99 {
    public static void main(String[] args) {
        final int minNum = 0;
        final int maxNum = 99;

        StringBuilder result = new StringBuilder();

        for (int i = minNum; i < maxNum; i++) {
            result.append(i);
            result.append(", ");
        }
        result.append(maxNum);

        System.out.println(result);
    }
}