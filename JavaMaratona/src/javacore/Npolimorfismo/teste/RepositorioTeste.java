package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Gaara");
        list.add("Kabuto");
        list.add("Shikamaru");
        System.out.println(list);
    }
}
