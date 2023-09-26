package maiusculo;

// Escreva um método que verifica se o caractere está em maiúsculo.

//     A classe deve se chamar Caractere
//     Protótipo: public static boolean EhMaiusculo(char c)
//     Retorna true se c estiver em maiúsculo, senão retorna false
//     Não é permitido utilizar Character.isLowerCase

public class Caractere {
    public static boolean EhMaiusculo(char c) {
        if(Character.isUpperCase(c)) {
            return true;
        }
        return false;
    }
}
