import java.util.List;
import java.util.Arrays;

public class Usuario implements Cliente{

    private Integer id;
    private String nome;
    private String endereco;
    private String pedido;
    private float valorPedido;

    public Usuario(int id) {
        this.id = id;
        Usuario objeto = BD.getUsuario(id);
        this.nome = objeto.nome;
        this.endereco = objeto.endereco;
        this.pedido=objeto.pedido;
        this.valorPedido = objeto.valorPedido;

    }

    public Usuario(Integer id, String nome, String endereco, String pedido, float valorPedido) {
        this.id = id;
        this.nome = nome;
        this.endereco=endereco;
        this.pedido=pedido;
        this.valorPedido = valorPedido;

    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosCliente() {
        return Arrays.asList(this.nome, this.endereco, this.pedido);

    }

    @Override
    public List<Float> obterNovoPedido(Adminstrador adminstrador) {
        return (List<Float>) Arrays.asList(this.valorPedido);
    }


   
}
