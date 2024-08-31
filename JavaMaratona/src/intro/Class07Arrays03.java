package intro;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int [] numeros2 = {21,22,23,24,25};
        int [] numeros3 = new int[]{11,12,13,14,15};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);

        }
        for(int num: numeros2){
            System.out.println(num);
        }
    }
}
