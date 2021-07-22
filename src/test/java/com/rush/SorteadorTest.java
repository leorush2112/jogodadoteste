package com.rush;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SorteadorTest {
    @Test
    public void deveJogarDadoCorretamente() {
        int quantidaDeSorteios = 3;
        Dado dado = new DadoMock(10);

        Sorteador sorteador = new Sorteador(quantidaDeSorteios, dado);

        Resultado resultado = sorteador.jogarDado();

        assertEquals(quantidaDeSorteios, resultado.getNumeros().length);
        assertEquals(3, resultado.somar());

    }

}
