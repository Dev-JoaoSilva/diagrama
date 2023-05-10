public class Vendedor extends Empregado{
    
    private float percentualComissao;

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public Vendedor(){

    }

    public Vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public String getVendedor() {
        return null;
    }



}
