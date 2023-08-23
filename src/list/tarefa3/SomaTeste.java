package list.tarefa3;

public class SomaTeste {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(1);
        soma.adicionarNumero(2);
        soma.adicionarNumero(3);
        soma.adicionarNumero(4);
        soma.adicionarNumero(5);
        soma.adicionarNumero(6);
        soma.adicionarNumero(7);
        soma.adicionarNumero(8);

        System.out.println("Lista dos números: " + soma.exibirNumeros());
        System.out.println("Total da Soma: " + soma.calcularSoma());
        System.out.println("Maior número: " + soma.encontrarMaiorNumero());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());
    }
}
