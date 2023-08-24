package set.tarefa1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private final Set<Convidado> convidadoSet;
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){convidadoSet.add(new Convidado(nome, codigo));}

    public void removerConvidadoPorCodigoConvite(int codigo){
        if(!convidadoSet.isEmpty()){
            for(Convidado convidado : convidadoSet){
                if(convidado.codigoConvite() == codigo){
                    convidadoSet.remove(convidado);
                    break;
                }
            }
        }
    }

    public int contarConvidados(){
       return convidadoSet.size();
    }

    public String exibirConvidados(){
        if(!convidadoSet.isEmpty()){
            StringBuilder mens = new StringBuilder();
            for(Convidado c : convidadoSet){
                mens.append(c.nome()).append("\n");
            }
            return mens.toString();
        } else {
            return "Sem convidados adicionados";
        }
    }

}
