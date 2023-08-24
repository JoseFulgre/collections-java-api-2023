package set.tarefa1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private String palavra;
    private Set<ConjuntoPalavrasUnicas> conjunto;

    public ConjuntoPalavrasUnicas(){
        this.conjunto = new HashSet<>();
    }
    private ConjuntoPalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void adicionarPalavra(String palavra){
        conjunto.add(new ConjuntoPalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        if(!conjunto.isEmpty()){
            for(ConjuntoPalavrasUnicas p : conjunto){
                if(p.getPalavra().equalsIgnoreCase(palavra)){
                    conjunto.remove(p);
                    break;
                }
            }
        }
    }

    public String verificarPalavra(String palavra){
        ConjuntoPalavrasUnicas p = new ConjuntoPalavrasUnicas(palavra);
        if(conjunto.contains(p)){
            return "A palavra apresentada está no conjunto";
        } else {
            return "A palavra apresentada não está no conjunto";
        }
    }

    public String exibirPalavrasUnicas(){
        return conjunto.toString();
    }

    @Override
    public String toString() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }
}
