package intro;

/*
Prática
Crie variáveis para os campos descritos abaixos entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
 */
public class Class03Exercise {
    public static void main(String[] args) {
        String nome = "Mauricio Bastos";
        String local = "Rua das Flores";
        double salarioDouble = 7590.13;
        String dataRecebimento = "01/01/2024";
        String relatorio = "Eu " +nome+ " morando na " +local+ " recebi o " +salarioDouble+ " em " +dataRecebimento;
        System.out.println(relatorio);
    }
}
