package javacore.Bintrometodos.teste;

import javacore.Bintrometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sandy");
        funcionario.setIdade(41);
        funcionario.setSalarios(new double[]{1245,932.32,3000});

        funcionario.imprime();
        System.out.println("Média "+ funcionario.getMedia());
    }
}
