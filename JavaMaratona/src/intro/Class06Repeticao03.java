package intro;

public class Class06Repeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor. Ex.: 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}