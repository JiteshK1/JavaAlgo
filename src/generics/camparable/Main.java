package generics.camparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student jitesh = new Student(19,88.5f);
        Student prakash = new Student(22,99.27f);
        Student charan = new Student(11,78.5f);
        Student vijay = new Student(25,95.27f);
        Student satish = new Student(55,68.5f);
        Student lata = new Student(21,79.27f);

        Student[] list = {jitesh, prakash, charan, vijay , satish , lata};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list,((  o1, o2) -> -(int)(o1.marks - o2.marks)) );

        System.out.println(Arrays.toString(list));

//if (jitesh.compareTo(prakash) > 0){
//    System.out.println("JItesh has greater marks");
//
//}else {
//    System.out.println("prakash has greater marks");
//}

    }
}
