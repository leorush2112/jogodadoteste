package com.rush;

public class DadoMock extends Dado {

    public DadoMock(int quantidadeLados) {
        super(quantidadeLados);
    }

    @Override
    public int sortear() {
        return 1;
    }

}