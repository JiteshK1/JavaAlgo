package interfaces.extendsDemo2;

public class Main implements B {


    @Override
    public void fun() {
        System.out.println("hee");
    }

    @Override
    public void greeting() {
        System.out.println("from B");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greeting();
        A.greeting();
    }
}
