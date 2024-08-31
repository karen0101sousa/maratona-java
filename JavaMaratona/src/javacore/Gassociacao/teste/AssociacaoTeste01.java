package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Flores");
        Aluno aluno = new Aluno("Leandro", 19);
        Professor professor = new Professor("Pedro","Engenharia");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Resistência dos Materiais",alunosParaSeminario,local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
