package org.example;

public class AcessoFaceebook {
    public boolean acessar() {
        return AcessoFacade.validarAcesso(this);
    }
}
