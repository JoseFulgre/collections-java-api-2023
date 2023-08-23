package list.tarefa1;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {

    private String descricao;
    private final List<Tarefa> lista = new ArrayList<>();

    public Tarefa(){
    }
    private Tarefa (String descricao) {
        this.descricao = descricao;
    }

    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : lista) {
            if (tarefa.descricao.equalsIgnoreCase(descricao)) {
                lista.remove(tarefa);
                break;
            }
        }
    }

        public int obterNumeroTotalTarefas(){
            return lista.size();
        }

        public String obterDescricoesTarefas(){
            StringBuilder mens = new StringBuilder();
            for(Tarefa tarefa : lista){
                mens.append(tarefa.descricao).append("\n");
            }
            return mens.toString();
        }
    }
