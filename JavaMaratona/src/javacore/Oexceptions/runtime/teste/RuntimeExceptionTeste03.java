package javacore.Oexceptions.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
    abreConexao();
    }
    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }
}
