
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();

    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefaList.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        for (int i = 0; i < tarefaList.size(); i++) {
            String descricaoNoArray = tarefaList.get(i).getDescricao();
            if (descricaoNoArray.equals(descricao)) {
                tarefaList.remove(i);
                break;

            } else if (i == tarefaList.size() - 1) {
                System.err.println("Tarefa não existente!");
            }

        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {

        for (int i = 0; i < tarefaList.size(); i++) {
            System.out.println(tarefaList.get(i).getDescricao());
        }

    }

}