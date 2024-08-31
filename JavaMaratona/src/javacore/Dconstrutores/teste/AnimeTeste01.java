package javacore.Dconstrutores.teste;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akira","TV",12, "Cyberpunk", "Production IG");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
