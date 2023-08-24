package set.tarefa2;

public class TarefasTeste {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Marcar reunião");
        lista.adicionarTarefa("Dentista");
        lista.adicionarTarefa("Cortar cabelo");

        System.out.println(lista.exibirTarefas());
        System.out.println(lista.contarTarefas());
        lista.marcarTarefaConcluida("dentista");
        lista.adicionarTarefa("Supermercado");
        lista.marcarTarefaConcluida("Marcar reunião");
        System.out.println(lista.obterTarefasConcluidas());

        lista.marcarTarefaPendente("Dentista");
        lista.marcarTarefaConcluida("Supermercado");
        lista.removerTarefa("Marcar reunião");
        System.out.println(lista.obterTarefasPendentes());
        System.out.println(lista.obterTarefasConcluidas());

        lista.limparListaTarefas();
        System.out.println(lista.exibirTarefas());
    }
}
