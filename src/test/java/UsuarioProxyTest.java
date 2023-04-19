import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioProxyTest {
    @BeforeEach
    void setUp() {
        BD.addUsuario(new Usuario(1, "João", "rua A n° 123 centro  Juiz de Fora", " X- Bacon", 15.0f));
        BD.addUsuario(new Usuario(2, "Artur", "rua A n° 125 centro  Juiz de Fora", " X- Tudo", 20.0f));
        BD.addUsuario(new Usuario(3, "Viviane", "rua A n° 124 MH  Juiz de Fora", " X-EGG", 13.0f));
        BD.addUsuario(new Usuario(4, "Cleber", "rua A n° 23 Bom Jardim  Juiz de Fora", " X- Bacon", 15.0f));
    }
    @Test
    void deveRetornarDadosCliente() {
        UsuarioProxy cliente = new UsuarioProxy(3);

        assertEquals(Arrays.asList("Viviane", "rua A n° 124 MH  Juiz de Fora", " X-EGG"), cliente.obterDadosCliente());
    }

    @Test
    void deveRetonarPedidoCliente() {
        Adminstrador funcionario = new Adminstrador("Clara", "Caixa",true);
        UsuarioProxy cliente = new UsuarioProxy(2);

        assertEquals(Arrays.asList(20.0f), cliente.obterNovoPedido(funcionario));
    }
    @Test
    void deveRetonarAdmNaoAurorizado() {
        try {
            Adminstrador funcionario = new Adminstrador("Rogerio", "Atendente",false);
            UsuarioProxy cliente = new UsuarioProxy(2);


            cliente.obterNovoPedido(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("sem autorisação de admistrador, para acessar!", e.getMessage());
        }


    }

}