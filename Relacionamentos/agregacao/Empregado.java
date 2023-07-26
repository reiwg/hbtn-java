public class Empregado {

    private String nome;
    private int codigo;
    private Endereco endereco; // Relacionamento com a classe Endereco

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void apresentar() {
        System.out.println("Codigo: " + this.getCodigo() + 
                        "\nNome: " + this.getNome() +
                        "\nBairro: " + endereco.getBairro() +
                        "\nCidade: " + endereco.getCidade() +
                        "\nPais: " + endereco.getPais());
    }

}
