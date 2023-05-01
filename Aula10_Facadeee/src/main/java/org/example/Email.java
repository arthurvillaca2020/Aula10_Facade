package org.example;

public class Email extends Credenciais{
    private static Email email = new Email();

    private Email() {};

    public static Email getInstancia() {
        return email;
    }
}
