package pedido_livraria;

import pedido_livraria.produtos.Produto;

public class Pedido {
    
    private double percentualDesconto;
    private ItemPedido[] itens;
    private double precoTotalPedido;

    public Pedido (double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double getPrecoTotalPedido() {
        return this.precoTotalPedido;
    }

    public void setPrecoTotalPedido(double precoTotalPedido) {
        this.precoTotalPedido = precoTotalPedido;
    }

    public double calcularTotal() {
        for (ItemPedido itemPedido : itens) {
            setPrecoTotalPedido(getPrecoTotalPedido() + itemPedido.getPreco() * itemPedido.getQuantidade());
        }

        if(getPercentualDesconto() > 0) {
            setPrecoTotalPedido(getPrecoTotalPedido() - (getPercentualDesconto() * getPrecoTotalPedido() / 100));
        }
        return precoTotalPedido;
        
    }

}

// Nesse exercício o objetivo é elaborar um sistema para calcular o total de um pedido em uma livraria.

//     A livraria possui dois tipos de produtos:
//         DVDs: o cálculo de seu preço líquido é seu preço bruto com acréscimo de 20%
//         Livros: o cálculo de seu preço líquido é seu preço bruto com acréscimo de 15%

//     Crie as classes conforme o diagrama abaixo:


//     Classe Produto deve ser abstrata.
//     O método obterPrecoLiquido na classe Produto deve ser um método abstrato.
//     Sobrescreva o método obterPrecoLiquido nas classes Livro e Dvd.
//     Coloque as classes Produto, Livro e Dvd no pacote produtos.

//     Crie os seguintes construtores:
//         Produto(String titulo, int ano, String pais, double precoBruto)
//         Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao)
//         Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao)
//         ItemPedido(Produto produto, int quantidade)
//         Pedido(double percentualDesconto, ItemPedido[] itens)

//     O método calcularTotal da classe Pedido deve percorrer cada um dos itens contidos no pedido e somar a quantidade solicitada pelo preco líquido do produto, deve-se também aplicar o percentual de desconto ao total dos itens.

//     Crie os métodos acessores getter quando necessário.
