public class Gerente extends Empregado{
    
    private String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public Gerente(){

    }

    public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getGerente() {
        return null;
    }

}
