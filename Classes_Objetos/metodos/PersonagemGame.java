package metodos;

public class PersonagemGame {

    // Faça uma cópia do arquivo PersonagemGame.java do exercício anterior (Encapsulamento) e faça as seguintes mudanças:
    // Crie um método público tomarDano que recebe um parâmetro int chamado quantidadeDeDano
    // O método tomarDano deve diminuir a quantidade de saúde atual do personagem subtraindo a quantidade de dano tomada.
    // O método tomarDano deve considerar que a saúde mínima do personagem é 0
    // Crie um método público receberCura que recebe um parâmetro int chamado quantidadeDeCura
    // O método receberCura deve aumentar a quantidade de saúde atual do personagem somando a quantidade de cura recebida.
    // O método receberCura deve considerar que a saúde máxima do personagem é 100


    private int saudeAtual;
    private String nome;

    public void tomarDano (int quantidadeDeDano) {

        int saudeMinima = 0;
        int novaSaude = this.getSaudeAtual() - quantidadeDeDano;
        this.setSaudeAtual(Math.max(saudeMinima, novaSaude));

        
    }

    public void receberCura (int quantidadeDeCura) {

        int saudeMaxima = 100;
        int novaSaude = this.getSaudeAtual() + quantidadeDeCura;
        this.setSaudeAtual(Math.min(saudeMaxima, novaSaude));
    }

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
