package intro;

public class Class06Repeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println("While " + count);
            count += 1;

        }
        count = 0;
        do {
            System.out.println("dentro do while " + ++count);
        } while (count < 10);

        for (count =0; count < 10; count++) {
            System.out.println("For "+ count);

        }

    }

}