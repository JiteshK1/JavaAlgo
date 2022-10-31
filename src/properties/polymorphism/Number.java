package properties.polymorphism;

public class Number {

    int sum(int a , int b){
        return  a + b;
    }
    int sum(int a , int b , int c){
        return  a + b + c;
    }
    int sum(String a , String b){
        return  2;
    }

    public static void main(String[] args) {
        Number obj = new Number();
        System.out.println(obj.sum(1,2));
    }
}

class  Num extends  Number{
static {
    System.out.println("Static Block");
    Num obj = new Num();

}
    public static void main(String[] args) {

    }

}
