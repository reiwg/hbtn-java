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


// Deseja-se criar uma implementação de notificação para vários canais de comunicação diferentes. No caso: email, sms, slack e teams.

//     Toda vez que ocorrer um evento importante no sistema, deseja-se enviar uma notificação.
//     Nessa aplicação simularemos um processador de vídeo para utilizarmos esse sistema de notificação.
//     Enum TipoMensagem com os valores: AVISO, ERRO, LOG

//     Classe Mensagem:
//         Crie os atributos texto do tipo String e tipoMensagem do tipo TipoMensagem

//     Interface CanalNotificacao que contém o método notificar(Mensagem mensagem)

//     Crie as implementações de CanalNotificacao:
//         Classe Email, apresenta a saída [EMAIL] {<tipo da mensagem>} - <texto da mensagem>
//         Classe Sms, apresenta a saída [SMS] {<tipo da mensagem>} - <texto da mensagem>
//         Classe Slack, apresenta a saída [SLACK] {<tipo da mensagem>} - <texto da mensagem>
//         Classe Teams, apresenta a saída [TEAMS] {<tipo da mensagem>} - <texto da mensagem>

//     enum FormatoVideo com os valores: MPEG, AVI, WMV, MP4, MKV

//     Classe Video:
//         Contém os atributos arquivo do tipo String e formato do tipo FormatoVideo

//     Classe ProcessadorVideo
//         Contém uma lista de objetos do tipo CanalNotificacao chamado canais
//         Contém o método registrarCanal que recebe um valor objeto do tipo CanalNotificação e adiciona a lista canais
//         Contém método processar que recebe um objeto do tipo Video. Esse método deve percorrer por todos os canais registros e notificar a mensagem <nome do video> - <formato> do tipo LOG