import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public ArrayList<CanalNotificacao> getCanais() {
        return this.canais;
    }

    public void setCanais(ArrayList<CanalNotificacao> canais) {
        this.canais = canais;
    }

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        this.canais.add(canalNotificacao);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            String mensagemString = String.format(
                "%s - %s", 
                video.getArquivo(), 
                video.getFormato()
            );
            Mensagem mensagem = new Mensagem(mensagemString, TipoMensagem.LOG);
            canal.notificar(mensagem);
        }
    }
}