public class Slack implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        String texto = String.format("[SLACK] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getMensagem());
        System.out.println(texto);
    }
    
}