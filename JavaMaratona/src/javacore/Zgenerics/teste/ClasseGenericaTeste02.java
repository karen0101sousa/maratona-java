package javacore.Zgenerics.teste;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}