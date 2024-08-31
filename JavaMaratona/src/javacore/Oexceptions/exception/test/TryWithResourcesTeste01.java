package javacore.Oexceptions.exception.test;

import javacore.Oexceptions.exception.dominio.Leitor1;
import javacore.Oexceptions.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) throws IOException {
    lerArquivo();
    }
    public static void lerArquivo() throws IOException {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
