package javacore.Ycolecoes.teste;


import javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "Pixel");
        System.out.println(s1.equals(s2));
    }
}