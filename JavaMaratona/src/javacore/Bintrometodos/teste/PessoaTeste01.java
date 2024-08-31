package javacore.Bintrometodos.teste;

import javacore.Bintrometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");
        //pessoa.idade = 70;
        pessoa.setIdade(70);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }

}
