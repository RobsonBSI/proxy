import java.util.List;

public class UsuarioProxy implements Cliente{

    private Usuario cliente;

    private Integer id;

    public UsuarioProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDadosCliente() {
        if (this.cliente == null) {
            this.cliente = new Usuario(this.id);
        }
        return this.cliente.obterDadosCliente();

    }

    @Override
    public List<Float> obterNovoPedido(Adminstrador adminstrador) {
        if (!adminstrador.isAdministrador()) {
            throw new IllegalArgumentException("sem autorisação de admistrador, para acessar!");
        }
        if (this.cliente== null) {
            this.cliente = new Usuario(this.id);
        }
        return this.cliente.obterNovoPedido(adminstrador);
    }


}
