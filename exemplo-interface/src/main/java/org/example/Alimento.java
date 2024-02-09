package org.example;

public class Alimento extends Produto {
    // Atributos
    private Integer quantVitamina;

    // construtor
    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }
// metodos
    @Override
    public Double getValorTributo() {
        return getPreco()* 0.15;
    }
    // getters e set

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }
}
