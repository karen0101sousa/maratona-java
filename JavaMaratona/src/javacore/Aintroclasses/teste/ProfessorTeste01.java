package javacore.Aintroclasses.teste;

import javacore.Aintroclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor ();

        professor.nome = "Mestre Kame";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome " + professor.nome + " idade " + professor.idade + " sexo " + professor.sexo);
    }
}
