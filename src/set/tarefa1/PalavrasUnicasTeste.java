package set.tarefa1;

public class PalavrasUnicasTeste {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Coisa");
        conjunto.adicionarPalavra("caso");
        conjunto.adicionarPalavra("Bacon");
        conjunto.adicionarPalavra("ovo");
        conjunto.adicionarPalavra("Carro");

        System.out.println(conjunto.verificarPalavra("Coisa"));

        conjunto.removerPalavra("caso");
        System.out.println(conjunto.exibirPalavrasUnicas());
    }
}
