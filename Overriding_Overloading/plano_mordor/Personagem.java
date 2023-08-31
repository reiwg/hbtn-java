import comida.Comida;
import humor.Feliz;
import humor.Humor;
import humor.Irritado;
import humor.MuitoFeliz;
import humor.Triste;

public class Personagem {
    
    private int pontosDeFelicidade = 0;

    public Humor obterHumorAtual() {
        
        //Early Return
        if (this.pontosDeFelicidade < -5) {
            return new Irritado();
        } 
        
        if (this.pontosDeFelicidade <= 0) {
            return new Triste();
        }

        if (this.pontosDeFelicidade <= 15) {
            return new Feliz();
        }  
        return new MuitoFeliz();
    }

    public void comer(Comida[] comidas) {
        for(Comida comida : comidas) {
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return this.pontosDeFelicidade + " - " + this.obterHumorAtual().getClass().getSimpleName();
    }
}