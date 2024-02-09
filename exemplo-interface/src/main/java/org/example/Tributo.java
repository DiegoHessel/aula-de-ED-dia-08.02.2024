package org.example;

import java.util.ArrayList;

public class Tributo {
    ArrayList<Tributavel> tributos = new ArrayList<Tributavel>();

    public Tributo() {
        this.tributos = tributos;
    }

    public void adicionarTributo(Tributavel t){
        tributos.add(t);
    }
    public Double calcularTotalTributo(){
        Double total = 0.0;
        for (Tributavel t: tributos){
            total += t.getValorTributo();
        }
        return total;
    }

    public void exibirTodos(){
        for (Tributavel t: tributos){
            System.out.println(t);
        }
    }
}
