public class Empregado{

        private String nome;
        private float salario;

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }

        public void setSalario(float salario) {
            this.salario = salario;
        }
        public float getSalario() {
            return salario;
        }

        public Empregado(){

        }

        public Empregado(String nome, float salario){
            this.nome = nome;
            this.salario = salario;
        }

        public String getEmpregado(){
            return null;
        }
    }

