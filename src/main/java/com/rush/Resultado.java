package com.rush;

public class Resultado {

    private int[] numeros;

    public Resultado(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    // public String mostrarNumeros() {
    // String string = "Os numeros sorteados são: ";
    // for (int i = 0; i < numeros.length; i++) {
    // string += numeros[i] + ", ";
    // }
    // string += "\nA soma é: " + somar();
    // return string;
    // }

    public int somar() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < numeros.length; i++) {
            string += numeros[i] + ", ";
        }
        return string.substring(0, string.length() - 2);

    }

}
