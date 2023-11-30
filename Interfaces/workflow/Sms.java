public class Sms implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        String texto = String.format("[SMS] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getMensagem());
        System.out.println(texto);
    }
    
}