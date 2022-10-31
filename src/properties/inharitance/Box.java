package properties.inharitance;

public class Box {
     private double p;
    double l;
    double h;
    double w;

    public double getP() {
        return p;
    }

    static  void  greeting(){
    System.out.println("HElw From Box");
}
    Box(){
        this.l= -1;
        this.h= -1;
        this.w= -1;
    }

    Box(double side){

        this.l= side;
        this.h= side;
        this.w= side;
    }

    Box(double l , double h , double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

}
