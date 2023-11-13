package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return listaTarefa.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefa tarefaList = new ListaTarefa();
        System.out.println("O número total de elementos da lista é: "+ tarefaList.obterNumeroTotalDeTarefas());

        tarefaList.adicionarTarefa("Tarefa 1");
        tarefaList.adicionarTarefa("Tarefa 2");
        tarefaList.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos da lista é: "+ tarefaList.obterNumeroTotalDeTarefas());

        tarefaList.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos da lista é: "+ tarefaList.obterNumeroTotalDeTarefas());

        tarefaList.obterDescricaoTarefa();
    }
}

