package intro;

public class Class05Condicionais02 {
    public static void main(String[] args) {
        // idade < 15 -> categoria infantil
        // idade >= 15 && idade < 18 -> categoria juvenil
        // idade >=18 -> categoria adulta

        int idade = 12;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
    }
}
