package javacore.ZZAclassesinternas.test;

public class OuterClassesTeste03 {
    private String name = "William";

    static class Nested {
        private String lastName = "Suane";

        void print() {
            System.out.println(new OuterClassesTeste03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste03.Nested nested = new OuterClassesTeste03.Nested();
        nested.print();
    }
}
