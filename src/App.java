
public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("correr");
        listaTarefa.adicionarTarefa("pular");
        listaTarefa.adicionarTarefa("assistir");
        listaTarefa.adicionarTarefa("assistir");

        listaTarefa.obterDescricoesTarefas();
        System.out.println("antes: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("assistir");
        System.out.println("depois: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }

}
