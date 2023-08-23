package list.tarefa3;

import java.util.ArrayList;
import java.util.List;

class SomaNumeros {

    private int numero = 0;
    private final List<SomaNumeros> lista = new ArrayList<>();

    public SomaNumeros() {}

    private SomaNumeros(int numero){this.numero = numero;}

    public void adicionarNumero(int numero){lista.add(new SomaNumeros(numero));}

    public int getNumero() {
        return numero;
    }

    public Integer calcularSoma(){
        if(!lista.isEmpty()){
            int count = 0;
            for(SomaNumeros soma : lista){
                count += soma.numero;
            }
            return count;
        } else {
            return null;
        }
    }

    public Integer encontrarMaiorNumero(){
        if(!lista.isEmpty()){
            int count = 0;
            for(SomaNumeros num : lista){
                if(num.numero > count)
                    count = num.numero;
            }
            return count;
        } else {
            return null;
        }
    }

    public Integer encontrarMenorNumero(){
        if(!lista.isEmpty()){
            int count = lista.get(0).getNumero();
            for(SomaNumeros num : lista){
                if(num.numero < count)
                    count = num.numero;
            }
            return count;
        } else {
            return null;
        }
    }

    public String exibirNumeros(){
        StringBuilder mens = new StringBuilder();
        for(SomaNumeros num : lista){
            mens.append("|").append(num.numero).append("|");
        }
        return mens.toString();
    }
}
