package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");

        Time time = new Time("Milan");
        jogador1.setTime(time);

        jogador1.imprime();

    }
}
