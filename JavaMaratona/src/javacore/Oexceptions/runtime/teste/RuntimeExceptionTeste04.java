package javacore.Oexceptions.runtime.teste;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args){

        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e){
            System.out.println("Dentro do Array | Arithmetic | Illegal");
        }catch (RuntimeException e){
            System.out.println("Dentro do Runtime");
        }
    }
}
