package list.tarefa2;

public class Compras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Feijão", 5.99, 2);
        carrinho.adicionarItem("Arroz", 4.50, 1);
        carrinho.adicionarItem("Batata", 2.99, 3);
        carrinho.adicionarItem("Carne", 25.20, 2);

        System.out.println(carrinho.exibirItens());
        System.out.println(carrinho.calcularValorTotal());

        carrinho.removerItem("Batata");

        System.out.println(carrinho.exibirItens());
        System.out.println(carrinho.calcularValorTotal());
    }
}
