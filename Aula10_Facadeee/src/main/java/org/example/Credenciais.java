package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Credenciais {
    private List<AcessoFaceebook> acessoComPendencia = new ArrayList<AcessoFaceebook>();

    public void addAcessoPendente(AcessoFaceebook acesso) {
        this.acessoComPendencia.add(acesso);
    }

    public boolean verificarAcessoComPendencia(AcessoFaceebook acesso) {
        return this.acessoComPendencia.contains(acesso);
    }
}
