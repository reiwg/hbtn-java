package status;



// Faça uma cópia do arquivo PersonagemGame.java do exercício anterior (metodos) e faça as seguintes mudanças:
// Crie um atributo privado chamado status do tipo String.
// Modifique o método setter de saude do personagem de forma que:
// se saude atual for maior que 0 então status deve possuir valor "vivo"
// se saude atual for 0 então status deve possuir valor "morto"
// Modifique os métodos tomarDano e receberCura para que ao invés de modificar diretamente o valor de saude atual utilize o métodos setter, dessa forma, a lógica de status ficará em um ponto só.
// Crie um método getter para o atributo status, não é necessário um método setter já que o atribuito é apenas de leitura (read-only).


public class PersonagemGame {

    private int saudeAtual;
    private String nome;
    private String status;

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

        if(saudeAtual > 0) {
            this.status = "Vivo";
        } else {
            this.status = "Morto";
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getStatus() {
        return this.status;
    }

}