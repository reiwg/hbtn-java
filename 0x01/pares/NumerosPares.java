package pares;

// Escreva um código em java que imprima os números pares de 0 a 99.

//     A classe deve se chamar NumerosPares
//     Os números devem estar separados por , seguido por um espaço
//     Os números devem ser impressos em ordem crescente
//     O último número deve ser seguido por um nova linha
//     Você não pode utilizar System.out.print mais do que duas vezes
//     Você pode utilizar apenas uma instrução de repetição em seu código.


public class NumerosPares {
    public static void main(String[] args) {
        int min = 0;
        int max = 99;
        StringBuilder resultado = new StringBuilder();

        for(int i = min; i <= max; i++) {
            if(i % 2 == 0) {
                resultado.append(i);
                if (i >= max -1 ) {
                    continue;
                } 
                resultado.append(", ");
            } 
        }
        System.out.println(resultado);
    }
}