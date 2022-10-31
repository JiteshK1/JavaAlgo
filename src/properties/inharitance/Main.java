package properties.inharitance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.9);
        Box box2 = new Box(box1);
//        System.out.println(box1.w + " " + box1.h);
//        box1.getP();

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);
        //  Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);
        BoxWeight obj = new BoxWeight();// You can inharit it but you can't override the static method
        BoxWeight.greeting();
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error

//        BoxWeight box5 = new Box(1,2,3,5)
//        System.out.println(box5);
//        Boxprice box32 = new Boxprice();
//        System.out.println(box32.h + " " + box32.weight);
//    Boxprice box22 = new Boxprice(box32);
//        System.out.println(box22.weight);

    }
}
