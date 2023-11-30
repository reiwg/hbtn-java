public class Mensagem {
    private String mensagem;
    private TipoMensagem tipoMensagem;

    public Mensagem(String mensagem, TipoMensagem tipoMensagem) {
        this.mensagem = mensagem;
        this.tipoMensagem = tipoMensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public TipoMensagem getTipoMensagem() {
        return this.tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }
}