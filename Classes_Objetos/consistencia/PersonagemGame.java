package consistencia;

// O intuito desse exercício é mantermos os dados do personagem sempre consistentes, ou seja, não devemos aceitar que algum programa possa criar um personagem e depois modificar o personsagem de forma que esse fique em um estado inconsistente. Um personagem inconsistente é:

//     Não possua um nome, ou um nome inválido.
//     Não possua uma saúde atual inválida.
//     Não possua um status válido.

// Faça uma cópia do arquivo PersonagemGame.java do exercício anterior(Status) e faça as seguintes mudanças:

//     Crie um construtor que receba um valor int para sua saúde atual inicial e um valor String para seu nome inicial, respectivamente. Dessa forma o personagem será criado consistente, ou seja, com um nome e com uma saúde atual.
//     Utilize o método setter de saúde atual no construtor, assim o status do personagem também possuirá um valor inicial conforme sua saúde atual.
//     Modifique o método setter de nome para que não aceite valor nulo ou string vazia, se este receber algum desses valores como parâmetro, deve-se manter o nome como está.

public class PersonagemGame {

    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.setSaudeAtual(saudeAtual);
        this.setNome(nome);
    }

    public void tomarDano(int quantidadeDeDano) {

        int saudeMinima = 0;
        int novaSaude = this.getSaudeAtual() - quantidadeDeDano;
        this.setSaudeAtual(Math.max(saudeMinima, novaSaude));

        
    }

    public void receberCura(int quantidadeDeCura) {

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
        
        if(nome == null || nome.isEmpty()) {
            
        } else {
            this.nome = nome;
        }
        
    }
    
    public String getStatus() {
        return this.status;
    }

}