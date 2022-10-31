package Introduction;

public class WrapperClassExample {
    public static void main(String[] args) {
//        int packages.a = 10;
//        int packages.b = 20;
//
//        Integer num = 45;

            Integer a = 10;
            Integer b = 20;
        ;

        System.out.println(a + " " + b);

        final A kunal = new A("Kunal Kushwaha");

    }


}
class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }


}
