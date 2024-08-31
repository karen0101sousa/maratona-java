package intro;

public class Class05Condicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida");
        }
        // isAutorizadoComprarBebida == false
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }
        System.out.println("Fora do if");
    }
}
