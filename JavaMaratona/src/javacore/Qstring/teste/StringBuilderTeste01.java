package javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("Dev Dojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb);
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
