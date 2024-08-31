package intro;

public class Class05Condicionais05Exercise {
    public static void main(String[] args) {
        double salario = 16.789;
        String taxaImpostoSalario;

        if (salario > 0 && salario <= 34.712) {
            taxaImpostoSalario = "Taxa 9,70%";
            //System.out.println("Taxa 9,70%");
        } else if (salario >= 34.713 && salario <= 68.507) {
            taxaImpostoSalario = "Taxa 37,35%";
            //System.out.println("Taxa 37,35%");
        } else {
            taxaImpostoSalario = "Taxa 49,50%";
            //System.out.println("Taxa 49,50%");
        }
        System.out.println(taxaImpostoSalario);
    }
}

/*Valores e taxas
0 até 34,712 = 9,70%
34,713 até 68,507 = 37,35%
68,508 = 49,50%
*/