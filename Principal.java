public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", 1600);
        Gerente gerente = new Gerente("João Silva", 1600, "Professor");
        Vendedor vendedor = new Vendedor("João Gomes", 1600, 15);

        System.out.println("Nome do Empregado: " + empregado.getEmpregado());
        System.out.println("Valor do Salario: " + empregado.getEmpregado());

        System.out.println("nome do Vendedor: " + vendedor.getVendedor());
        System.out.println("Salario do Vendedor: " + vendedor.getVendedor());
        System.out.println("Percentual Comissao: " + vendedor.getVendedor());
        
        System.out.println("Nome do Gerente: " + gerente.getGerente());
        System.out.println("Salario do Gerente: " + gerente.getGerente());
        System.out.println("Percentual Comissao: " + gerente.getGerente());
    }
}