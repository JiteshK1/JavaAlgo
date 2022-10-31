package generics.camparable;

public class Student implements  Comparable<Student> {
    int rollno;
    float marks;

    @Override
    public String toString() {
        return "" + rollno +
                " " + marks ;
    }

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    public  int  compareTo(Student s){
        int diff = (int)(this.marks - s.marks);
        return diff;
        //here diff == 0 means both are equal
        // if diff is < 0 then Student s is greater else s is smaller;
        //
    }
}
