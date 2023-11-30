public class Email implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        String texto = String.format("[EMAIL] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getMensagem());
        System.out.println(texto);
    }
}