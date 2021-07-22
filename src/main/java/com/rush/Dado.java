package com.rush;

public class Dado {
    // Atributos
    private int quantidadeLados;

    // Construtor
    public Dado(int quantidadeLados) {
        this.quantidadeLados = quantidadeLados;
    }

    // Métodos
    public int sortear() {
        double sorteio = Math.random() * quantidadeLados;
        double numeroArredondado = Math.ceil(sorteio);
        return (int) numeroArredondado; // casting
    }

}