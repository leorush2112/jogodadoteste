package com.rush;

public class Sorteador {

    private int quantidaDeSorteios;
    private Dado dado;

    public Sorteador(int quantidaDeSorteios, Dado dado) {
        this.quantidaDeSorteios = quantidaDeSorteios;
        this.dado = dado;
    }

    public Resultado jogarDado() {
        int[] numeros = new int[quantidaDeSorteios];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = dado.sortear();
        }
        return new Resultado(numeros);

    }
}
