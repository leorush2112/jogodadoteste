package com.rush;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ResultadoTest {

    @Test
    public void deveSomarOsNumerosDoVetor() {
        // Dado que
        int[] numeros = { 1, 2, 3 };
        Resultado resultado = new Resultado(numeros);

        // quando
        int soma = resultado.somar();

        // Entao
        assertEquals(6, soma);
    }

    @Test
    public void deveConverterString() {
        int[] numeros = { 1, 2, 3 };
        Resultado resultado = new Resultado(numeros);

        String string = resultado.toString();

        assertEquals("1, 2, 3", string);

    }
}