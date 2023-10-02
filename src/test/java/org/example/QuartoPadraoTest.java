package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoPadraoTest {

    @Test
    void deveRetornarPrecoDoQuartoPadraoServicoPadrao() {
        Servico servico = new ServicoPadrao();
        QuartoLuxo quartoLuxo = new QuartoLuxo(200.00f);
        quartoLuxo.setServico(servico);
        assertEquals(200.0f, quartoLuxo.calcularPreco());
    }

    @Test
    void deveRetornarPrecoDoQuartoPadraoServicoGold() {
        Servico servico = new ServicoGold();
        QuartoLuxo quartoLuxo = new QuartoLuxo(200.00f);
        quartoLuxo.setServico(servico);
        assertEquals(250.0f, quartoLuxo.calcularPreco());
    }

    @Test
    void deveRetornarPrecoDoQuartoPadraoServicoPlatinum() {
        Servico servico = new ServicoPlatinum();
        QuartoLuxo quartoLuxo = new QuartoLuxo(200.00f);
        quartoLuxo.setServico(servico);
        assertEquals(300.0f, quartoLuxo.calcularPreco());
    }

}