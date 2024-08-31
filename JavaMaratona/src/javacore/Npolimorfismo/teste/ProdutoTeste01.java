package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC01i7", 15000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 42\"", 3678);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
