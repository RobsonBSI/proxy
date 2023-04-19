public class Adminstrador  {

    private String nome;
    private float salario;
    private boolean administrador;

    public Adminstrador(String nome, float salario, boolean administrador) {
        this.nome = nome;
        this.salario=salario;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
