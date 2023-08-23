package list.tarefa1;

public class ListaTarefas {

    public static void main(String[] args) {

        Tarefa tarefa =  new Tarefa();

        tarefa.adicionarTarefa("Correr");
        tarefa.adicionarTarefa("Beber");
        tarefa.adicionarTarefa("Caminhar");
        tarefa.adicionarTarefa("Parar");

        tarefa.removerTarefa("Caminhar");

        System.out.println(tarefa.obterDescricoesTarefas());
        System.out.println(tarefa.obterNumeroTotalTarefas());
    }
}
