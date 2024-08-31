package intro;

public class Class02PrimitveTypes {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long e boolean

        int idade = 10;
        int idadeCasting = (int) 1000000000000000000L;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        float salarioFloatF = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        String nome = "Gohan";

        System.out.println("A idade é "+idade+" anos");
        System.out.println("A idade é "+idadeCasting+" anos");
        System.out.println("O salário é "+salarioFloatF+" reais");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println( "Oi meu nome é " +nome);

        // Casting

    }
}
