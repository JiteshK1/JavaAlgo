package properties.inharitance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){ // Super class varibale can be used to  reference any object from derived class
        super(other); // here BoxWeight other object is passed to Box constructor
        weight = other.weight;
    }
    BoxWeight(double l , double h ,double w , double weight){
        super(l, h, w); // What is this? This says that call the parent class Constructor.
        //use to initialize values present in parent class
        this.weight = weight;
    }

}
