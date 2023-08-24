package set.tarefa2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {
    private final Set<Tarefa> tarefas = new HashSet<>();
    public ListaTarefas() {}

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefasARemover = tarefas.stream()
                .filter(n -> n.getDescricao().equalsIgnoreCase(descricao))
                .collect(Collectors.toSet());

        tarefas.removeAll(tarefasARemover);
    }
    public String exibirTarefas(){
        if(!tarefas.isEmpty()){
            return tarefas.toString();
        } else {
            return "Não há tarefas adicionadas.";
        }
    }
    public String contarTarefas(){
        if(!tarefas.isEmpty()){
            return "Quantidade de tarefas: " + tarefas.size();
        } else {
            return "Não há tarefas adicionadas.";
        }
    }

    public String obterTarefasConcluidas(){
        if(!tarefas.isEmpty()){
            StringBuilder mens = new StringBuilder();
            tarefas.stream()
                    .filter(Tarefa::isConcluida)
                    .forEach(n -> mens.append(n.getDescricao()));

            return "Tarefas concluidas: "+ mens;
        } else {
            return "Não há tarefas adicionadas.";
        }
    }

    public String obterTarefasPendentes(){
        if(!tarefas.isEmpty()){
            StringBuilder mens = new StringBuilder();
            tarefas.stream()
                    .filter(n -> !n.isConcluida())
                    .forEach(n -> mens.append(n.getDescricao()));

            return "Tarefas pendentes: "+ mens;
        } else {
            return "Não há tarefas adicionadas.";
        }
    }

    public void marcarTarefaConcluida(String descricao){
        tarefas.stream()
                .filter(n -> n.getDescricao().equalsIgnoreCase(descricao))
                .forEach(n -> n.setConcluida(true));
    }

    public void marcarTarefaPendente(String descricao){
        tarefas.stream()
                .filter(n -> n.getDescricao().equalsIgnoreCase(descricao))
                .forEach(n -> n.setConcluida(false));
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }


}

class Tarefa {
    private final String descricao;
    private boolean concluida;

    public Tarefa (String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {return descricao;}

    public boolean isConcluida() {return concluida;}

    @Override
    public String toString() {
        if(isConcluida()){
            return "descricao: " + descricao + '\'' +
                    ", concluida: Sim\n";
        } else {
            return "descricao: " + descricao + '\'' +
                    ", concluida: Não\n";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }
}
