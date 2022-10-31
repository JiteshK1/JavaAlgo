package cloning;

public class Human implements Cloneable {
    int age;
    String name;
int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,2,1,5,0};

    }
//    public Human (Human other){
//        this.age =other.age;
//        this.name = other.name;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      Human twin = (Human)super.clone(); // this is shallow copy

        // this is deep copy
        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
            
        }
        return twin;

    }
}
