package javacore.Eblocosinicializacao.dominio;

import org.w3c.dom.ls.LSOutput;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Dentro do bloco inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome){
            this.nome = nome;
        }

    public Anime(){
        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("---");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
