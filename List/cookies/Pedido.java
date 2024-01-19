package cookies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    
    private List <PedidoCookie> cookies;
    private int totalCaixas;

    public Pedido() {
        cookies = new ArrayList<>();
        this.totalCaixas = 0;
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
        this.setTotalCaixas(this.getTotalCaixas() + pedidoCookie.getQuantidadeCaixas());
    }

    public int obterTotalCaixas() {
        return this.getTotalCaixas();
    }

    public int removerSabor(String sabor) {
        int totalRemovido = 0;

        Iterator <PedidoCookie> iterator = cookies.iterator();
        while(iterator.hasNext()) {
            PedidoCookie pedido = iterator.next();
            if(pedido.getSabor() == sabor) {
                totalRemovido += pedido.getQuantidadeCaixas();
                iterator.remove();
            }
            
        }
        setTotalCaixas(getTotalCaixas() - totalRemovido);
        return totalRemovido;
    }

    public int getTotalCaixas() {
        return this.totalCaixas;
    }

    public void setTotalCaixas(int totalCaixas) {
        this.totalCaixas = totalCaixas;
    }

}

// Uma organização arrecada dinheiro com a venda de caixas de biscoitos. Um pedido de cookie especifica o sabor e o número de caixas encomendadas.

//     Classe PedidoCookie
//         Possui os atributos String sabor e int quantidadeCaixas.
//         Construtor que inicializa o valores de ambos atributos, respectivamente ao listados anteriormente.
//         Métodos acessores para cada uma dos atributos.

//     Class Pedido
//         Contém uma ArrayList chamada cookies de PedidoCookie
//         Inicialize a ArrayList no construtor
//         Adicione um método adicionarPedidoCookie que permita adicionar PedidoCookie a lista
//         Adicione um método obterTotalCaixas que calcula e retorna a quantidade de caixas totais de todos cookies encomendados.
//         Adicione um método removerSabor que remove da lista todas encomendas de um sabor específico. Esse método retorna a quantidade total de caixas removidas.