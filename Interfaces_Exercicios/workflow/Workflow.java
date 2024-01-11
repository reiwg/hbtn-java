package workflow;

import java.util.ArrayList;
import java.util.List;

import workflow.atividades.Atividade;

public class Workflow {
    private List<Atividade> atividades = new ArrayList<>();

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void executarAtividade() {
        for (Atividade pegarAtividades : atividades) {
            pegarAtividades.executar();
        }
    }
}