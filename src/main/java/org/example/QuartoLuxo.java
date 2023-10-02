package org.example;

public class QuartoLuxo extends Quarto {

    public QuartoLuxo(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.servico.percentualAumento());
    }
}