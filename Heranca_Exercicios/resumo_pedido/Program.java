package resumo_pedido;

public class Program {
    public static void main(String[] args) {
            resumo_pedido.produtos.Livro livro1 = new resumo_pedido.produtos.Livro("Duna", 2017, "Brasil", 56.30, 680, "Frank Herbert", 1);
            resumo_pedido.produtos.Livro livro2 = new resumo_pedido.produtos.Livro("Um de nos esta mentindo", 2018, "Brasil", 34.93, 384,
                            "Karen Mcmanus", 1);
            resumo_pedido.produtos.Livro livro3 = new resumo_pedido.produtos.Livro("Mindset Milionario", 2021, "Brasil", 31.70, 272,
                            "José Roberto Marques", 1);

            resumo_pedido.produtos.Dvd dvd1 = new resumo_pedido.produtos.Dvd("Anjos da Noite 5 - Guerras de Sangue", 2016, "Estados Unidos",
                            16.90,
                            "Anna Foerster",
                            "Ação", 91);
            resumo_pedido.produtos.Dvd dvd2 = new resumo_pedido.produtos.Dvd("Annabelle 2 - A Criacao do Mal", 2017, "Brasil", 39.90,
                            "Jame Wan e Peter Safran",
                            "Terror",
                            109);

            // Pedido 1
            ItemPedido[] itensPedido1 = new ItemPedido[] {
                            new ItemPedido(livro1, 1),
                            new ItemPedido(dvd2, 1)
            };

            Pedido pedido1 = new Pedido(0, itensPedido1);

            pedido1.apresentarResumoPedido();

            // Pedido 2
            ItemPedido[] itensPedido2 = new ItemPedido[] {
                            new ItemPedido(livro1, 1),
                            new ItemPedido(dvd2, 1)
            };

            Pedido pedido2 = new Pedido(10, itensPedido2);

            pedido2.apresentarResumoPedido();

            // Pedido 3
            ItemPedido[] itensPedido3 = new ItemPedido[] {
                            new ItemPedido(livro2, 1),
                            new ItemPedido(livro3, 2),
                            new ItemPedido(dvd1, 1)
            };

            Pedido pedido3 = new Pedido(5, itensPedido3);

            pedido3.apresentarResumoPedido();

            // Pedido 4
            ItemPedido[] itensPedido4 = new ItemPedido[] {
                            new ItemPedido(livro2, 1),
                            new ItemPedido(livro2, 1),
                            new ItemPedido(livro3, 2),
                            new ItemPedido(dvd1, 1),
                            new ItemPedido(dvd2, 2)
            };

            Pedido pedido4 = new Pedido(5, itensPedido4);

            pedido4.apresentarResumoPedido();
    }
}
