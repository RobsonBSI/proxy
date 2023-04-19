public class Adminstrador  {

    private String nome;
    private String cargo;
    private boolean administrador;

    public Adminstrador(String nome,String cargo, boolean administrador) {
        this.nome = nome;
        this.cargo= cargo;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
