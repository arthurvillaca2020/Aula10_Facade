package org.example;

public class Senha extends Credenciais{
    private static Senha senha = new Senha();

    private Senha() {};

    public static Senha getInstancia() {
        return senha;
    }
}
