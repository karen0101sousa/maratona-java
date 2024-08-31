package javacore.Jmodificadorfinal.teste;

import javacore.Jmodificadorfinal.dominio.Carro;
import javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Jonas");
        System.out.println(carro.COMPRADOR);
    }
}
