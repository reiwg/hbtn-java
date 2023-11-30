public class Teams implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        String texto = String.format("[TEAMS] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getMensagem());
        System.out.println(texto);
    }
}