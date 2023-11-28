package resumo_pedido;


public class Pedido {
    
    private ItemPedido[] itens;
    private double precoBruto;
    private double precoComDesconto;
    private double totalDoDesconto;
    private double percentualDesconto;

    public Pedido (double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
        calcularPrecoBruto();
        calcularTotal();
    }

    public double getPrecoBruto() {
        return this.precoBruto;
    }

    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }

    public double getPrecoComDesconto() {
        return this.precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }

    public double getTotalDoDesconto() {
        return this.totalDoDesconto;
    }

    public void setTotalDoDesconto(double totalDoDesconto) {
        this.totalDoDesconto = totalDoDesconto;
    }

    public double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public void calcularPrecoBruto() {
        double precoTemporario = getPrecoBruto();
        for (ItemPedido itemPedido : itens) {
            precoTemporario += itemPedido.getPrecoTotalItensPedido();
        }
        setPrecoBruto(precoTemporario);
    }

    public double calcularDesconto() {
        return (getPrecoBruto() * getPercentualDesconto() / 100);
    }

    public void calcularTotal() {
        final double desconto = calcularDesconto();
        final double precoFinal = getPrecoBruto() - desconto;
        setPrecoComDesconto(precoFinal);
        setTotalDoDesconto(desconto);
    }

    public void apresentarItemPedido(ItemPedido item) {
        final String mensagem = String.format("Titulo: %s Preco: %.2f Quant: %d Total: %.2f",
                                        item.getTitulo(), item.getPreco(), item.getQuantidade(),
                                        item.getPrecoTotalItensPedido());
        System.out.println(mensagem);
    }

    public void apresentarResumoPedido() {
        for (ItemPedido itensPedido : this.itens) {
            apresentarItemPedido(itensPedido);
        }
        System.out.println("----------------------------");
        System.out.println(String.format("DESCONTO: %.2f" , this.getTotalDoDesconto()));
        System.out.println(String.format("TOTAL PRODUTOS: %.2f" , this.getPrecoBruto()));
        System.out.println("----------------------------");
        System.out.println(String.format("TOTAL PEDIDO: %.2f", this.getPrecoComDesconto())); 
        System.out.println("----------------------------");
    }
}

// Nesse exercício o objetivo é apresentar um resumo do pedido.

//     Adicione o método apresentarResumoPedido() na classe Pedido. Esse método apresentar as informações do pedido da seguinte forma:

// ------- RESUMO PEDIDO -------
// Tipo: Livro  Titulo: Um de nos esta mentindo  Preco: 40,17  Quant: 1  Total: 40,17
// Tipo: Livro  Titulo: Mindset Milionario  Preco: 36,46  Quant: 2  Total: 72,91
// Tipo: Dvd  Titulo: Anjos da Noite 5 - Guerras de Sangue  Preco: 20,28  Quant: 1  Total: 20,28
// ----------------------------
// DESCONTO: 6,67
// TOTAL PRODUTOS: 133,36
// ----------------------------
// TOTAL PEDIDO: 126,69
// ----------------------------

