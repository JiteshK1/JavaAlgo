package interfaces.extendsDemo;

public class Main implements B {


    @Override
    public void fun() {
        System.out.println("hee");
    }

    @Override
    public void greeting() {

    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fun();
    }
}
