package org.example;

public abstract class Quarto {
    protected float precoBase;
    protected Servico servico;

    public Quarto(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public abstract float calcularPreco();
}