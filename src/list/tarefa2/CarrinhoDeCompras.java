package list.tarefa2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> lista = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        lista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for(Item item : lista){
            if(item.NOME.equalsIgnoreCase(nome)){
                lista.remove(item);
                break;
            }
        }
    }

    public String calcularValorTotal(){
        double total = 0.0;
        for(Item item : lista){
            total += item.PRECO * item.QUANTIDADE;
        }
        return "Valor total no carrinho: R$" + total + "\n";
    }

    public String exibirItens(){
        StringBuilder mens = new StringBuilder();
        int count = 1;
        for(Item item : lista){
            mens.append(count).append(") ").append(item.NOME)
                    .append(" - R$")
                    .append(item.PRECO)
                    .append(" - QNT: ")
                    .append(item.QUANTIDADE)
                    .append("\n");
            count++;
        }
        return mens.toString();
    }
}
