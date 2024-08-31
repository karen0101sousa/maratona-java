package javacore.Csobrecargametodos.teste;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive2","TV2",12, "Cyberpunk");
        anime.imprime();
    }
}
