package interfaces;

public class Car implements Engine , Brake  {
    @Override
    public void brake() {
        System.out.println("This is Brake");
    }

    @Override
    public void start() {
        System.out.println("This is how the car starts");

    }

    @Override
    public void stop() {
        System.out.println("This is how the car Stops");
    }

    @Override
    public void acc() {
        System.out.println("This is how the car Accelerate");
    }
}
