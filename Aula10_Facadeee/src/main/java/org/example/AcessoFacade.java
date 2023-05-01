package org.example;

public class AcessoFacade {
    public static boolean validarAcesso(AcessoFaceebook acesso) {
        if (Senha.getInstancia().verificarAcessoComPendencia(acesso)) {
            return false;
        }
        if (Email.getInstancia().verificarAcessoComPendencia(acesso)) {
            return false;
        }

        return true;
    }
}
