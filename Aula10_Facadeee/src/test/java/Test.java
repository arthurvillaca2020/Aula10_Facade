import org.example.AcessoFaceebook;
import org.example.Email;
import org.example.Senha;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    void deveRetornarPendenciaNaSenha() {
        AcessoFaceebook acesso = new AcessoFaceebook();
        Senha.getInstancia().addAcessoPendente(acesso);

        assertEquals(false, acesso.acessar());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarPendenciaNaEmail() {
        AcessoFaceebook acesso = new AcessoFaceebook();
        Email.getInstancia().addAcessoPendente(acesso);

        assertEquals(false, acesso.acessar());
    }
}
