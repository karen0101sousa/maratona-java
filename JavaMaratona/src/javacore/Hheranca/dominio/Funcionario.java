package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
       private  double salario;
    static{
        System.out.println("Dentro do bloco estático de Funcionario");
    }
    {
        System.out.println("Bloco de inicialização de Funcionario");
    }
    {
        System.out.println("Bloco de inicialização de Funcionario");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }


       public void imprime(){
           super.imprime();
           System.out.println(this.salario);
    }

        public void relatorioPagamento(){
            System.out.println("Eu " + this.nome + " recebi o slario " + this.salario);
    }
        public double getSalario() {
            return salario;
    }

        public void setSalario(double salario) {
            this.salario = salario;
    }
}
