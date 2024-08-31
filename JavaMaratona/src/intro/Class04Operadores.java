package intro;

public class Class04Operadores {
    public static void main(String[] args) {
        // + - / * -> Aritméticos
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 * numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Relacionais < > <= >= == != -> Retorna valor booleano
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("Dez é maior que vinte " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte " + isDezMenorQueVinte);

        // Lógicos && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaleiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaleiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay5 = 5000F;
        boolean isPlay5Compravel = valorTotalContaCorrente > valorPlay5 || valorTotalContaPoupanca > valorPlay5;
        System.out.println("Play 5 é comprável " +isPlay5Compravel);

        // Atribuição = += -= *= /= %=
        double bonus = 1800;
        bonus += 500;
        bonus -= 300;
        bonus /= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 3;
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
