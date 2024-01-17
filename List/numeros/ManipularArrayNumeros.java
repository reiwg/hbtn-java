package numeros;

import java.util.List;


public class ManipularArrayNumeros {
    
    public static int buscarPosicaoNumero(List<Integer> numeros, Integer numeroBuscado) {
        return numeros.indexOf(numeroBuscado);
    }

    public static void adicionarNumero(List<Integer> numeros, Integer numeroAdicionar) throws Exception {
        if(buscarPosicaoNumero(numeros, numeroAdicionar) != -1) {
            throw new Exception("Numero jah contido na lista");
        } else {
        numeros.add(numeroAdicionar);
        }
    }

    public static void removerNumero(List<Integer> numeros, Integer numeroRemover) throws Exception {
        if(buscarPosicaoNumero(numeros, numeroRemover) == -1) {
            throw new Exception("Numero nao encontrado na lista");
        } else {
        numeros.remove(numeroRemover);
        }
    }

    public static void substituirNumero(List<Integer> numeros, Integer numeroSubstituir, Integer numeroSubstituto) {
        if(numeros.contains(numeroSubstituir)){
            Integer indice = numeros.indexOf(numeroSubstituir);
            numeros.set(indice, numeroSubstituto);
        } else {
        numeros.add(numeroSubstituto);
        }
    } 
}

// Crie uma Classe ManipularArrayNumeros que possui os seguintes métodos estáticos:

//     buscarPosicaoNumero: quer recebe uma lista de inteiros e um número a ser buscado na lista. Esse método deve retornar a posicao do número na lista, se número não for encontrado retorna -1.

//     adicionarNumero: que recebe uma lista de inteiros e um número para ser adicionado como parâmetro. Esse método verifica se o número já existe na lista, se sim, lança uma exceção com a mensagem Numero jah contido na lista, se não, adiciona o item na lista, utilize o método buscarPosicaoNumero.

//     removerNumero: que recebe uma lista de inteiros e um número a ser removido da lista. Se o número não for encontrado na lista deve-se lançar uma exceção com a mensagem Numero nao encontrado na lista, utilize o método buscarPosicaoNumero.

//     substituirNumero: que recebe uma lista de inteiros e dois números numeroSubstituir e numeroSubstituto, deve buscar o produto e substituí-lo. Caso o número a ser substituído não exista, apenas adicione o número substituto.
