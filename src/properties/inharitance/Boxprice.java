package properties.inharitance;

public class Boxprice extends  BoxWeight {
    double price;
    Boxprice(){
        super();
        this.price = -1;
    }
    Boxprice(Boxprice other){
        super(other);
     price = other.price;

    }

    Boxprice(double l , double h , double w , double weight , double price){
        super(l , h, w , weight);
        this.price = price;
    }

}
