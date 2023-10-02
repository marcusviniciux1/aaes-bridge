package org.example;

public class QuartoPadrao extends Quarto {

    public QuartoPadrao(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase;
    }
}