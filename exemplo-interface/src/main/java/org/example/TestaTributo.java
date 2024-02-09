package org.example;

public class TestaTributo {
    public static void main(String[] args) {
        Alimento alimento01 = new Alimento(1,"carne para churasco",10.20,1);
        Perfume perfume01 = new Perfume(1,"cheroso bom",100.00,"amadeirado");
        Servico servico01 = new Servico("desenvolvedor",1000.00);
        Tributo tributo = new Tributo();
        tributo.adicionarTributo(alimento01);
        tributo.adicionarTributo(perfume01);
        tributo.adicionarTributo(servico01);
        tributo.exibirTodos();
System.out.println("Total de tributos: "+tributo.calcularTotalTributo());
    }
}
