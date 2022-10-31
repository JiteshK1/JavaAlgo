package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws  CloneNotSupportedException {
        Human jitesh = new Human(20,"jitesh");
        //Human arjit = new Human(jitesh); instead of doing this using Cloneable  Interface
        Human twin = (Human) jitesh.clone();
        System.out.println(Arrays.toString(jitesh.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(jitesh.arr));
    }
}
