public class InteiroPositivo {

// Crie o atributo valor do tipo int.
// Crie um construtor que receba um valor int que converta e inicializa o atributo valor.
// Crie um construtor que receba um valor String que converta e inicializa o atributo valor.
// Deve-se validar se o valor é inteiro, senão uma mensagem de texto (Usar a exceção IllegalArgumentException ) Valor nao eh um valor inteiro positivo--
// Daremos mais “poder” para nossa classe incluindo o método ehPrimo que retorna um boolean true se o número recebido for primo, senão retorna false.
    
    private int valor;

    public InteiroPositivo(int valor) throws IllegalArgumentException {
        if (valor >= 0) {
            this.setValor(valor);
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public InteiroPositivo(String valor) {
        if (Integer.valueOf(valor) >= 0) {
            this.valor = Integer.valueOf(valor);
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public boolean ehPrimo() {
        int numero = getValor();

        if (numero < 2) {
            return false;
        }

        for (int x = 2; x <= Math.sqrt(numero); x++) {
            if (numero % x == 0) // nao e primo
                return false;   
        }
        return true;
    }


    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {

        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

}