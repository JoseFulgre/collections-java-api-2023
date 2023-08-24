package set.tarefa1;

public class ConjuntoTeste {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println(convidados.exibirConvidados());

        convidados.adicionarConvidado("Pedro", 1526);
        convidados.adicionarConvidado("Maria", 4697);
        convidados.adicionarConvidado("Penha", 8869);
        convidados.adicionarConvidado("João", 1512);
        convidados.adicionarConvidado("José", 4016);

        System.out.println(convidados.exibirConvidados());
        System.out.println("Quantidade de Convidados: "+convidados.contarConvidados());

        convidados.removerConvidadoPorCodigoConvite(1526);
        System.out.println(convidados.exibirConvidados());
        System.out.println("Quantidade de Convidados: "+convidados.contarConvidados());
    }
}
