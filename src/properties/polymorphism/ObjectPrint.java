package properties.polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num=num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(32);
        System.out.println(obj); // it runs default method of its superclass that is Object Class... i
        // it runs toString method of its superClasss
        //but if we have our own toString method it will run Our to string
    //By default in java Every  extends  Object class
    }
}
