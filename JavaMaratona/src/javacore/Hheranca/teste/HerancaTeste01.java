package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("10134-555");
        Pessoa pessoa = new Pessoa("Marcos Bastos");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Bruno Lima");
        funcionario.setCpf("23451111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2134.98);
        System.out.println("------");
        funcionario.imprime();

    }
}
