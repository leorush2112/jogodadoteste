package com.rush;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DadoTest {
    @Test
    public void deveSortearNumeroDentroIntervalo() {
        int quantidadeLados = 6;
        Dado dado = new Dado(quantidadeLados);

        // quando
        int[] resultados = new int[100];
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = dado.sortear();
        }

        for (int resultado : resultados) {
            assertTrue(resultado >= 1);
            assertTrue(resultado <= quantidadeLados);
        }
    }
}
