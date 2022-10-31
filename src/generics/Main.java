package generics;

public class Main implements  GeneticInterface<Integer>{
    @Override
    public void additon(Integer value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.additon(22);
    }
}
