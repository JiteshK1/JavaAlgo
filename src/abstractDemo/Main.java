package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son  son = new Son(22);
        Daughter daughter = new Daughter();
        System.out.println(son.age);

        System.out.println(son.VALUE);
        son.carrier();
        daughter.partner();
    }
}
