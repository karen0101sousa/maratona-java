package javacore.Oexceptions.exception.test;

import javacore.Oexceptions.exception.dominio.Funcionario;
import javacore.Oexceptions.exception.dominio.LoginInvalidoException;
import javacore.Oexceptions.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) throws LoginInvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        }catch(LoginInvalidoException | FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
