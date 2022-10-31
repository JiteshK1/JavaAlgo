package Introduction;

public class Main {
    public static void main(String[] args) {
        //store 5 roll nos
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        // data of 5 students
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] mamrks = new float[5];

        Student Jitesh = new Student();
//        Jitesh.rollno = 19;
//        Jitesh.name = "Jitesh";
//        Jitesh.marks = 87.80f;
//
//        System.out.println(Jitesh.rollno);
//        System.out.println(Jitesh.name);
//        System.out.println(Jitesh.marks);
//        Jitesh.changeName("pandu");
//        Jitesh.greeting();
        Student random = new Student(Jitesh);
        Student random2=new Student();
//        System.out.println(random.rollno);
        System.out.println(random2.rollno);

Student stu = new Student();
    }

}

class Student {

    int rollno;
    String name;
    float marks;

    void changeName(String name){
        this.name=name;
    }
    void greeting(){
        System.out.println("Helw " + name);
    }
    Student(Student other){
       this.rollno=other.rollno;
       this.name=other.name;
       this.marks=other.marks;
    }
    Student () {
        // this is how you call packages.a constructor from another constructor
        // internally: new Introduction.Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    Student(int rollno , String name , float marks){
        // Introduction.Student arpit = new Introduction.Student(17, "Arpit", 89.7f);
        // here, this will be replaced with arpit
        this.rollno = rollno;
        this.name=name;
        this.marks=marks;
    }
}
