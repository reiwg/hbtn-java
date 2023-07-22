package encapsulamento;

public class Program {
    public static void main(String[] args) {
        PersonagemGame personagem1 = new PersonagemGame();

        personagem1.setNome("Sonic");
        personagem1.setSaudeAtual(10);  // apropriado pois utiliza os metodos acessores

        System.out.printf("Nome: %s - Saude: %d\n", personagem1.getNome(), personagem1.getSaudeAtual());
    }
}