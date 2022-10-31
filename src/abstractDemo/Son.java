package abstractDemo;

public class Son extends  Parent{

    Son(int age){
        this.age = age;
    }
    @Override

    void  carrier(){
        System.out.println("I Am Son");
    }
    @Override

    void  partner(){
        System.out.println("I Am Partner of your Son");
    }

}
