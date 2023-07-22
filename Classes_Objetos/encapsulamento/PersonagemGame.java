package encapsulamento;

// A classe deve se chamar PersonagemGame
// Deve possuir um atributo privado chamado saudeAtual
// Deve possuir um atributo privado chamado nome
// Deve possuir os métodos getters e setters para ambos atributos:

public class PersonagemGame {

    private int saudeAtual;
    private String nome;


    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
