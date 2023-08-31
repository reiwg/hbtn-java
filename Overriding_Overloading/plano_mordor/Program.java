// Gandalf, o Cinzento é um grande mago, mas ele também adora comer e a comida o faz perder sua capacidade de lutar contra as trevas. Os orcs de Mordor pediram a você para projetar um programa que calcule o humor de Gandalf. Para que pudessem prever as batalhas entre eles e tentar derrotar o Mago Cinzento. Quando Gandalf está com fome, fica com raiva e não consegue lutar bem. Como os orcs têm um espião, ele contou a eles os alimentos que Gandalf está comendo e o resultado em seu humor depois de comer um pouco. Então aqui está a lista:

// Cram: 2 pontos de felicidade
// Lembas: 3 pontos de felicidade
// Maçã: 1 ponto de felicidade
// Melão: 1 ponto de felicidade
// Bolo de Mel: 5 pontos de felicidade
// Cogumelos: -10 pontos de felicidade
// Todo o resto: -1 ponto de felicidade

// Os humores de Gandalf são:

// Irritado: abaixo de -5 pontos de felicidade;
// Triste: de -5 a 0 pontos de felicidade;
// Feliz: de 1 a 15 pontos de felicidade;
// Muito Feliz: quando os pontos de felicidade são maiores que 15;

// A tarefa é simples. Modelar um aplicativo que calcule os pontos de felicidade que Gandalf tem após comer toda a comida passada na entrada.

// Escreva as seguintes classes:

// Classe: Comida
//     pacote: comida
//     classe abstrata
//     contém o atributo protected pontosDeFelicidade
//     crie um construtor que receba o valor de pontosDeFelicidade

// Crie uma classe para cada uma das comidas com seus pontos de felicidades, devem herdar da classe Comida e estar no pacote comida.
// - Classes: Cram, Lembas, Maca, Melao, BoloDeMel, Cogumelo, OutraComida

// Classe: Humor
//     pacote: humor
//     classe abstrata

// Crie uma classe para cada um dos humores, devem herdar da classe Humor e estar no pacote humor
//     Classes: Irritado, Triste, Feliz, MuitoFeliz.

// Classe: Personagem
//     contém o atributo pontosDeFelicidade.
//     contém o método obterHumorAtual() que retorna um objeto da classe Humor.
//     contém o método comer(Comida[] comidas), método recebe um vetor de comidas ingeridas.
//     sobrescreva o método toString() para retornar <pontos de felicidade> - <humor>. Dica: para apresentar o nome da classe de uma referência utilize objetoHumor.getClass().getName() ou objetoHumor.getClass().getSimpleName() para nome da classe sem o pacote.
    
    import humor.*;
    import comida.*;

    public class Program {
        public static void main(String[] args) {
            Personagem gandalf = new Personagem();
            Personagem bilbo = new Personagem();
            Personagem legolas = new Personagem();
            Personagem tauriel = new Personagem();

            gandalf.comer(new Comida[] {
                    new Maca(),
                    new Maca(),
                    new Cogumelo(),
                    new OutraComida()
            });

            System.out.println(gandalf.toString());

            bilbo.comer(new Comida[] {
                    new BoloDeMel(),
                    new Maca(),
                    new Melao(),
                    new Cogumelo()
            });

            System.out.println(bilbo.toString());

            legolas.comer(new Comida[] {
                    new BoloDeMel(),
                    new Maca(),
                    new Melao(),
                    new Cogumelo(),
                    new BoloDeMel(),
                    new Cram(),
                    new Cram()
            });

            System.out.println(legolas.toString());

            legolas.comer(new Comida[] {
                    new BoloDeMel(),
                    new Maca(),
                    new Melao(),
                    new Cogumelo(),
                    new BoloDeMel(),
                    new Lembas(),
                    new Lembas(),
                    new Cram()
            });

            System.out.println(legolas.toString());
        }
    }
