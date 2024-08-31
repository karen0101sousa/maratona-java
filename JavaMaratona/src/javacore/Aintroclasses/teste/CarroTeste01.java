package javacore.Aintroclasses.teste;

import javacore.Aintroclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro ();
        Carro carro2 = new Carro ();

        carro1.nome = "Audi";
        carro1.modelo = "A5";
        carro1.ano = 2020;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Polo";
        carro2.ano = 2013;

        System.out.println("Nome:"+carro1.nome + " Modelo:" + carro1.modelo + " Ano:" +carro1.ano);
        System.out.println("----------------");
        System.out.println("Nome:"+carro2.nome + " Modelo:" + carro2.modelo + " Ano:" +carro2.ano);
    }
}
