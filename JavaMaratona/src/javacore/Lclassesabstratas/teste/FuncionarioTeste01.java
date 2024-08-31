package javacore.Lclassesabstratas.teste;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Funcionario;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 6000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zoro",3500);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();


    }
}
