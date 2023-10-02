package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoLuxoTest {

    @Test
    void deveRetornarPrecoDoQuartoLuxoServicoPadrao() {
        Servico servico = new ServicoPadrao();
        QuartoLuxo quartoLuxo = new QuartoLuxo(400.00f);
        quartoLuxo.setServico(servico);
        assertEquals(400.0f, quartoLuxo.calcularPreco());
    }

    @Test
    void deveRetornarPrecoDoQuartoLuxoServicoGold() {
        Servico servico = new ServicoGold();
        QuartoLuxo quartoLuxo = new QuartoLuxo(400.00f);
        quartoLuxo.setServico(servico);
        assertEquals(500.0f, quartoLuxo.calcularPreco());
    }

    @Test
    void deveRetornarPrecoDoQuartoLuxoServicoPlatinum() {
        Servico servico = new ServicoPlatinum();
        QuartoLuxo quartoLuxo = new QuartoLuxo(400.00f);
        quartoLuxo.setServico(servico);
        assertEquals(600.0f, quartoLuxo.calcularPreco());
    }
}