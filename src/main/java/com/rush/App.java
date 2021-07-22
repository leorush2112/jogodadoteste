package com.rush;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando o Objeto Dado passando o numero de lados
        Dado dado = new Dado(10);

        // Classe sorteador recebe quantidadeDeSorteios e um Dado
        Sorteador sorteador = new Sorteador(3, dado);

        Resultado resultado = sorteador.jogarDado();

        System.out.println(resultado);

    }

}
